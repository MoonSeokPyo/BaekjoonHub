import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_7576();
		
		br.close();
		bw.close();
	}
	static void func_7576() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		int[] cnt = {0};
		Queue<int[]> queue = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 1) {
					int[] tomato= {i, j};
					queue.add(tomato);
				}
			}
		}
		
		func_7576_tomato(arr, cnt, queue);
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				if (arr[i][j] == 0)
					cnt[0] = -1;
		
		bw.write(cnt[0] + "");
	}
	static void func_7576_tomato(int[][] arr, int[] cnt, Queue<int[]> queue) {
		boolean ch = false;
		int size = queue.size();
		int[][] dir = {
				{0, 0, -1, 1},
				{-1, 1, 0, 0}
		};
		
		for (int i = 0; i < size; i++) {
			int[] tomato = queue.remove();
			for (int j = 0; j < 4; j++) {
				if (
						(tomato[0] + dir[0][j]) >= 0 && 
						(tomato[0] + dir[0][j]) < arr.length && 
						(tomato[1] + dir[1][j]) >= 0 && 
						(tomato[1] + dir[1][j]) < arr[0].length && 
						arr[tomato[0] + dir[0][j]][tomato[1] + dir[1][j]] == 0
						) {
					if (!ch)
						ch = true;
					arr[tomato[0] + dir[0][j]][tomato[1] + dir[1][j]] = 1;
					int[] nextTomato = {tomato[0] + dir[0][j], tomato[1] + dir[1][j]};
					queue.add(nextTomato);
				}
			}
		}
		if (ch) {
			cnt[0]++;
			func_7576_tomato(arr, cnt, queue);
		}
	}
}