import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15784();
		
		br.close();
		bw.close();
	}
	
	static void func_15784() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[][] peoples = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				peoples[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int value = peoples[a][b];
		for (int i = 1; i <= n; i++) {
			if (i != a && peoples[i][b] > value) {
				bw.write("ANGRY");
				return;
			}
			if (i != b && peoples[a][i] > value) {
				bw.write("ANGRY");
				return;
			}
		}
		bw.write("HAPPY");
	}
}