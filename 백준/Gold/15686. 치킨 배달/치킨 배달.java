import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15686();
		
		br.close();
		bw.close();
	}
	
	static void func_15686() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n][n];
		int houseCnt = 0;
		int chickenCnt = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 1)
					houseCnt++;
				else if (map[i][j] == 2)
					chickenCnt++;
			}
		}
		int[][] house = new int[houseCnt][2];
		int houseIdx = 0;
		int[][] chicken = new int[chickenCnt][2];
		int chickenIdx = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1) {
					house[houseIdx][0] = i;
					house[houseIdx][1] = j;
					houseIdx++;
				} else if (map[i][j] == 2) {
					chicken[chickenIdx][0] = i;
					chicken[chickenIdx][1] = j;
					chickenIdx++;
				}
			}
		}
		
		Context_15686 ct = new Context_15686();
		ct.chicken = chicken; ct.house = house;
		func_15686_solve(ct, new boolean[chickenCnt], 0, m);
		bw.write(ct.result + "");
	}
    static class Context_15686{
		int result = Integer.MAX_VALUE;
		int[][] house;
		int[][] chicken;
	}
	static void func_15686_solve(Context_15686 ct, boolean[] visited, int depth, int cnt) {
		if (depth == visited.length) {
			if (cnt == 0) {
				int result = 0;
				for (int i = 0; i < ct.house.length; i++) {
					int min = Integer.MAX_VALUE;
					for (int j = 0; j < ct.chicken.length; j++) {
						if (visited[j]) {
							int height = Math.abs(ct.house[i][0] - ct.chicken[j][0]);
							int width = Math.abs(ct.house[i][1] - ct.chicken[j][1]);
							min = Math.min(min, height + width);
						}
					}
					result += min;
					if (result >= ct.result)
						return;
				}
				ct.result = result;
			}
			return;
		}
		if (cnt > 0) {
			visited[depth] = true;
			func_15686_solve(ct, visited, depth + 1, cnt - 1);
		}
		visited[depth] = false;
		func_15686_solve(ct, visited, depth + 1, cnt);
	}
}