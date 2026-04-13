import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_19236();
		
		br.close();
		bw.close();
	}
	
	static class Context_19236 {
		int[] dy = {0, -1, -1, 0, 1, 1, 1, 0, -1};
		int[] dx = {0, 0, -1, -1, -1, 0, 1, 1, 1};
		int[][] fish = new int [16 + 1][2];
		int[] dir = new int [16 + 1];
		int[][] arr = new int [4][4];
	}
	static void func_19236() throws Exception {
		Context_19236 c = new Context_19236();
		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				int num = Integer.parseInt(st.nextToken());
				int dir = Integer.parseInt(st.nextToken());
				c.arr[i][j] = num;
				c.fish[num][0] = i;
				c.fish[num][1] = j;
				c.dir[num] = dir;
			}
		}
		
		bw.write(func_19236_solve(0, 0, 0, c) + "");
	}
	static int func_19236_solve(int y, int x, int cnt, Context_19236 c) {
		int fishNum = c.arr[y][x];
		int sharkDir = c.dir[fishNum];
		cnt += fishNum;
		c.arr[y][x] = 0;
		int max = cnt;
		func_19236_move(y, x, c);
		for (int i = 1; i < 4; i++) {
			int ny = y + c.dy[sharkDir] * i;
			int nx = x + c.dx[sharkDir] * i;
			if(ny >= 0 && ny < 4 && nx >= 0 && nx < 4 && c.arr[ny][nx] != 0) {
				Context_19236 nc = copy(c);
				max = Math.max(max, func_19236_solve(ny, nx, cnt, nc));
			}
		}
		return max;
	}
	static Context_19236 copy(Context_19236 c) {
	    Context_19236 nc = new Context_19236();

	    for(int i=0;i<4;i++)
	        nc.arr[i] = c.arr[i].clone();

	    for(int i=1;i<=16;i++)
	        nc.fish[i] = c.fish[i].clone();

	    nc.dir = c.dir.clone();

	    return nc;
	}
	static void func_19236_move(int y, int x, Context_19236 c) {
		for (int i = 1; i <= 16; i++) {
			int cy = c.fish[i][0];
			int cx = c.fish[i][1];
			if(c.arr[cy][cx] != i)
				continue;
			int dir = c.dir[i];
			for (int j = 0; j < 8; j++) {
				int nd = dir + j;
				nd = nd > 8 ? nd - 8 : nd;
				int ny = cy + c.dy[nd];
				int nx = cx + c.dx[nd];
				if (ny >= 0 && ny < 4 && nx >= 0 && nx < 4 && !(ny == y && nx == x)) {
					c.dir[i] = nd;
					if(c.arr[ny][nx] == 0) {
						c.arr[ny][nx] = i;
						c.arr[cy][cx] = 0;
						c.fish[i][0] = ny;
						c.fish[i][1] = nx;
					} else {
						int tmp = c.arr[ny][nx];
						int tmpY = c.fish[tmp][0];
						int tmpX = c.fish[tmp][1];
						c.arr[ny][nx] = i;
						c.arr[cy][cx] = tmp;
						c.fish[tmp][0] = c.fish[i][0];
						c.fish[tmp][1] = c.fish[i][1];
						c.fish[i][0] = tmpY;
						c.fish[i][1] = tmpX;
					}
					break;
				}
			}
		}
	}
}