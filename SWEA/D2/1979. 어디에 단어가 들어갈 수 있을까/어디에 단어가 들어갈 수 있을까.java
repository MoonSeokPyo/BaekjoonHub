import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1979();
		
		br.close();
		bw.close();
	}
	
	static void func_1979() throws Exception {
		StringBuilder sb = new StringBuilder();
		int testcase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testcase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[][] puzzleR = new int[n][n];
			int[][] puzzleC = new int[n][n];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++)
					puzzleR[i][j] = puzzleC[i][j] = Integer.parseInt(st.nextToken());
			}
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < n; j++) {
					if (puzzleR[i][j] == 1) {
						puzzleR[i][j] += puzzleR[i][j - 1];
						if (puzzleR[i][j] == k && (j == n - 1 || puzzleR[i][j + 1] == 0))
							cnt++;
					}
					if (puzzleC[j][i] == 1) {
						puzzleC[j][i] += puzzleC[j - 1][i];
						if (puzzleC[j][i] == k && (j == n - 1 || puzzleC[j + 1][i] == 0))
							cnt++;
					}
				}
			}
			sb.append('#').append(t).append(' ').append(cnt).append('\n');
		}
		bw.write(sb.toString());
	}
}