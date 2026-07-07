import java.util.*;
import java.io.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1210();
		
		br.close();
		bw.close();
	}
	
	static void func_1210() throws Exception {
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());
			int[][] l = new int[100][100];
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					l[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int end_Y = 99, end_X = -1;
			for (int i = 0; i < 100; i++) {
				if (l[end_Y][i] == 2)
					end_X = i;
			}
			
			sb.append('#').append(tc).append(' ').append(func_1210_up(l, new int[] {end_Y, end_X})).append('\n');
		}
		bw.write(sb.toString());
	}
	static int func_1210_up(int[][] l, int[] pos) {
		int dir = func_1210_dir(l, pos);
		switch (dir) {
		case -1:
			pos[1] = func_1210_move(l, pos[0], pos[1], dir);
			break;
		case 1:
			pos[1] = func_1210_move(l, pos[0], pos[1], dir);
			break;
		}
		pos[0] = pos[0] - 1;
		if (pos[0] < 0)
			return pos[1];
		return func_1210_up(l, pos);
	}
	static int func_1210_move(int[][] l, int y, int x, int dir) {
		int nx = x + dir;
		if (nx < 0 || 100 <= nx || l[y][nx] == 0) {
			return x;
		}
		return func_1210_move(l, y, nx, dir);
	}
	static int func_1210_dir(int[][] l, int[] pos) {
		int cy = pos[0];
		int cx = pos[1];
		int ny = cy;
		int nx = cx - 1;
		
		if (nx >= 0 && l[ny][nx] == 1)
			return -1;
		
		ny = cy;
		nx = cx + 1;
		
		if (nx < 100 && l[ny][nx] == 1)
			return 1;
		
		return 0;
	}
}