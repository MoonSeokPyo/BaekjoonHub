import java.util.*;
import java.io.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		func_1211();

		br.close();
		bw.close();
	}

	static void func_1211() throws Exception {
		StringBuilder sb = new StringBuilder();
		for (int tc = 0; tc < 10; tc++) {
			int T = Integer.parseInt(br.readLine());
			int[][] board = new int[100][100];
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			boolean[] goal = new boolean[100];
			for (int i = 0; i < 100; i++) {
				if (board[99][i] == 1) {
					goal[i] = true;
				}
			}

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if (board[i][j] == 1)
						board[i][j] = Integer.MAX_VALUE;
				}
			}

			int result = -1;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < 100; i++) {
				if (goal[i])
					func_1211_up(board, 99, i, 0);
			}
			for (int i = 0; i < 100; i++) {
				if (board[0][i] != 0 && board[0][i] < min) {
					min = board[0][i];
					result = i;
				}
			}

			sb.append('#').append(T).append(' ').append(result).append('\n');
		}
		bw.write(sb.toString());
	}

	static void func_1211_up(int[][] board, int y, int x, int dist) {
		if (y == 0) {
			board[y][x] = Math.min(dist, board[y][x]);
			return;
		}
		int nx = x - 1;
		if (0 <= nx && board[y][nx] != 0) {
			nx = func_1211_go(board, y, nx, -1);
			int sub = Math.abs(x - nx);
			func_1211_up(board, y - 1, nx, dist + sub + 1);
			return;
		}
		nx = x + 1;
		if (nx < 100 && board[y][nx] != 0) {
			nx = func_1211_go(board, y, nx, 1);
			int sub = Math.abs(x - nx);
			func_1211_up(board, y - 1, nx, dist + sub + 1);
			return;
		}
		func_1211_up(board, y - 1, x, dist + 1);
	}

	static int func_1211_go(int[][] board, int y, int x, int dir) {
		if (board[y - 1][x] != 0) {
			return x;
		}
		int nx = x + dir;
		return func_1211_go(board, y, nx, dir);
	}
}