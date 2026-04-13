import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10026();
		
		br.close();
		bw.close();
	}
	
	static void func_10026() throws Exception {
		int n = Integer.parseInt(br.readLine());
		char[][] generalPainting = new char[n][];
		for (int i = 0; i < n; i++) {
			generalPainting[i] = br.readLine().toCharArray();
		}
		int length = generalPainting[0].length;
		char[][] painting = new char[n][length];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < length; j++) {
				if (generalPainting[i][j] == 'R')
					painting[i][j] = 'G';
				else
					painting[i][j] = generalPainting[i][j];
			}
		}
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		int generalCnt = 0, cnt = 0;
		boolean[][] generalVisited = new boolean[n][length];
		boolean[][] visited = new boolean[n][length];
		Queue<int[]> q = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < length; j++) {
				if (!generalVisited[i][j]) {
					generalCnt++;
					q.add(new int[] {i, j});
					generalVisited[i][j] = true;
					while (!q.isEmpty()) {
						int[] cur = q.poll();
						for (int k = 0; k < 4; k++) {
							int ny = dy[k] + cur[0];
							int nx = dx[k] + cur[1];
							if (ny >= 0 && ny < n && nx >= 0 && nx < length && !generalVisited[ny][nx] && generalPainting[ny][nx] == generalPainting[i][j]) {
								generalVisited[ny][nx] = true;
								q.add(new int[] {ny, nx});
							}
						}
					}
				}
				if (!visited[i][j]) {
					cnt++;
					q.add(new int[] {i, j});
					visited[i][j] = true;
					while (!q.isEmpty()) {
						int[] cur = q.poll();
						for (int k = 0; k < 4; k++) {
							int ny = dy[k] + cur[0];
							int nx = dx[k] + cur[1];
							if (ny >= 0 && ny < n && nx >= 0 && nx < length && !visited[ny][nx] && painting[ny][nx] == painting[i][j]) {
								visited[ny][nx] = true;
								q.add(new int[] {ny, nx});
							}
						}
					}
				}
			}
		}
		bw.write(generalCnt + " " + cnt);
	}
}