import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1215();
		
		br.close();
		bw.close();
	}
	
	static void func_1215() throws Exception {
		StringBuilder sb = new StringBuilder();
		char[][] board = new char[8][8];
		for (int tc = 1; tc <= 10; tc++) {
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < 8; i++) {
				String input = br.readLine();
				for (int j = 0; j < 8; j++)
					board[i][j] = input.charAt(j);
			}
			int cnt = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8 - n; j++) {
					boolean isPal = true;
					for (int k = 0; k < n / 2; k++) {
						if (board[i][j + k] != board[i][j + (n - 1) - k]) {
							isPal = false;
							break;
						}
					}
					if (isPal)
						cnt++;
					isPal = true;
					for (int k = 0; k < n / 2; k++) {
						if (board[j + k][i] != board[j + (n - 1) - k][i]) {
							isPal = false;
							break;
						}
					}
					if (isPal)
						cnt++;
				}
			}
			sb.append('#').append(tc).append(' ').append(cnt).append('\n');
		}
		bw.write(sb.toString());
	}
}