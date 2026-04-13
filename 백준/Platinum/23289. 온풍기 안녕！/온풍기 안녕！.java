import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_23289();
		
		br.close();
		bw.close();
	}
    
	static void func_23289() throws Exception {
		// 1 오른쪽
		// 2 왼쪽
		// 3 위
		// 4 아래
		int[] dy = {0, 0, 0, -1, 1};
		int[] dx = {0, 1, -1, 0, 0};
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] room = new int[r + 1][c + 1];
		int[][] tmpRoom = new int[r + 1][c + 1];
		int kCnt = 0;
		int heaterCnt = 0;
		for (int i = 1; i <= r; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= c; j++) {
				int input = Integer.parseInt(st.nextToken());
				if (1 <= input && input <= 4) {
					heaterCnt++;
					room[i][j] = input;
				} else if (input == 5) {
					kCnt++;
					room[i][j] = input;
				}
			}
		}
		int[][] kIdx = new int[kCnt][2];
		int[][] heaterIdx = new int[heaterCnt][2];
		int[] heater = new int[heaterCnt];
		boolean[][][] heatVisited = new boolean[heaterCnt][r + 1][c + 1];
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				int input = room[i][j];
				if (1 <= input && input <= 4) {
					heaterCnt--;
					heaterIdx[heaterCnt][0] = i;
					heaterIdx[heaterCnt][1] = j;
					heater[heaterCnt] = input;
					room[i][j] = 0;
				} else if (input == 5) {
					kCnt--;
					kIdx[kCnt][0] = i;
					kIdx[kCnt][1] = j;
					room[i][j] = 0;
				}
			}
		}
		
		boolean[][][] wall = new boolean[r + 1][c + 1][4 + 1];
		int w = Integer.parseInt(br.readLine());
		for (int i = 0; i < w; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			if (t == 0) {
				// (x, y)와 (x-1, y)
				wall[x][y][3] = true;
				int nx = x - 1;
				if (nx > 0)
					wall[nx][y][4] = true;
			} else if (t == 1) {
				// (x, y)와 (x, y+1)
				wall[x][y][1] = true;
				int ny = y + 1;
				if (ny <= c)
					wall[x][ny][2] = true;
			}
		}
		
		Context_23289 cont = new Context_23289();
		cont.c = c; cont.k = k; cont.r = r; cont.room = room; cont.tmpRoom = tmpRoom; cont.kIdx = kIdx; cont.dy = dy; cont.dx = dx; cont.wall = wall;
		
		int chocoCnt = 0;
		while(!func_23289_kCheck(cont)) {
//		집에 있는 모든 온풍기에서 바람이 한 번 나옴
			for (int i = 0; i < heater.length; i++) {
				for (int y = 1; y <= r; y++)
					for (int x = 1; x <= c; x++)
						heatVisited[i][y][x] = false;
				int dir = heater[i];
				int y = heaterIdx[i][0] + dy[dir];
				int x = heaterIdx[i][1] + dx[dir];
				func_23289_heating(cont, heatVisited[i], dir, 5, y, x);
			}
//		온도가 조절됨
			func_23289_control(cont);
//		온도가 1 이상인 가장 바깥쪽 칸의 온도가 1씩 감소
			for (int i = 1; i <= r; i++) {
				if (room[i][1] > 0)
					room[i][1]--;
				if (room[i][c] > 0)
					room[i][c]--;
			}
			for (int i = 2; i < c; i++) {
				if (room[1][i] > 0)
					room[1][i]--;
				if (room[r][i] > 0)
					room[r][i]--;
			}
			chocoCnt++;
            if (chocoCnt > 100)
				break;
		}
        bw.write(chocoCnt + "");
	}
	static void func_23289_control(Context_23289 c) {
		int[][] room = c.room;
		int[][] tmp = c.tmpRoom;
		for (int i = 1; i <= c.r; i++)
			for (int j = 1; j <= c.c; j++)
				tmp[i][j] = 0;
		for (int i = 1; i <= c.r; i++) {
			for (int j = 1; j <= c.c; j++) {
				int cnt = 0;
				for (int k = 1; k <= 4; k++) {
					int ny = i + c.dy[k];
					int nx = j + c.dx[k];
					if (!c.wall[i][j][k] && ny >= 1 && ny <= c.r && nx >= 1 && nx <= c.c && room[i][j] > room[ny][nx]) {
						int n = (room[i][j] - room[ny][nx]) / 4;
						tmp[ny][nx] += n;
						cnt += n;
					}
				}
				tmp[i][j] += room[i][j] - cnt;
			}
		}
		for (int i = 1; i <= c.r; i++) {
			for (int j = 1; j <= c.c; j++) {
				c.room[i][j] = tmp[i][j];
			}
		}
	}
	static void func_23289_heating(Context_23289 c, boolean[][] visited, int dir, int num, int y, int x) {
		visited[y][x] = true;
		c.room[y][x] += num;
		num--;
		if (num == 0)
			return;
		int ny = y + c.dy[dir];
		int nx = x + c.dx[dir];
		if (!c.wall[y][x][dir] && ny >= 1 && ny <= c.r && nx >= 1 && nx <= c.c && !visited[ny][nx])
			func_23289_heating(c, visited, dir, num, ny, nx);
		if (dir == 1 || dir == 2) {
			ny = y + c.dy[3];
			nx = x + c.dx[3];
			if (!c.wall[y][x][3] && ny >= 1 && ny <= c.r && nx >= 1 && nx <= c.c && !visited[ny][nx]) {
				int nny = ny + c.dy[dir];
				int nnx = nx + c.dx[dir];
				if (!c.wall[ny][nx][dir] && nny >= 1 && nny <= c.r && nnx >= 1 && nnx <= c.c && !visited[nny][nnx])
					func_23289_heating(c, visited, dir, num, nny, nnx);
			}
			ny = y + c.dy[4];
			nx = x + c.dx[4];
			if (!c.wall[y][x][4] && ny >= 1 && ny <= c.r && nx >= 1 && nx <= c.c && !visited[ny][nx]) {
				int nny = ny + c.dy[dir];
				int nnx = nx + c.dx[dir];
				if (!c.wall[ny][nx][dir] && nny >= 1 && nny <= c.r && nnx >= 1 && nnx <= c.c && !visited[nny][nnx])
					func_23289_heating(c, visited, dir, num, nny, nnx);
			}
		} else {
			ny = y + c.dy[1];
			nx = x + c.dx[1];
			if (!c.wall[y][x][1] && ny >= 1 && ny <= c.r && nx >= 1 && nx <= c.c && !visited[ny][nx]) {
				int nny = ny + c.dy[dir];
				int nnx = nx + c.dx[dir];
				if (!c.wall[ny][nx][dir] && nny >= 1 && nny <= c.r && nnx >= 1 && nnx <= c.c && !visited[nny][nnx])
					func_23289_heating(c, visited, dir, num, nny, nnx);
			}
			ny = y + c.dy[2];
			nx = x + c.dx[2];
			if (!c.wall[y][x][2] && ny >= 1 && ny <= c.r && nx >= 1 && nx <= c.c && !visited[ny][nx]) {
				int nny = ny + c.dy[dir];
				int nnx = nx + c.dx[dir];
				if (!c.wall[ny][nx][dir] && nny >= 1 && nny <= c.r && nnx >= 1 && nnx <= c.c && !visited[nny][nnx])
					func_23289_heating(c, visited, dir, num, nny, nnx);
			}
		}
	}
	static boolean func_23289_kCheck(Context_23289 c) {
		for (int i = 0; i < c.kIdx.length; i++) {
			int y = c.kIdx[i][0];
			int x = c.kIdx[i][1];
			if (c.room[y][x] < c.k) {
				return false;
			}
		}
		return true;
	}
	static class Context_23289{
		int r;
		int c;
		int k ;
		int[][] room;
		int[][] tmpRoom;
		int[][] kIdx;
		boolean[][][] wall;
		int[] dy;
		int[] dx;
	}
}