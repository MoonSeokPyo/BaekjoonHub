import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11651();
		
		br.close();
		bw.close();
	}
	static void func_11651() throws Exception {
		// 15:20
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][];
		for (int i = 0; i < N; i++) {
			arr[i] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		}
		Arrays.sort(arr, (int[] o1, int[] o2) -> {
			if (o1[1] == o2[1])
				return o1[0] - o2[0];
			else
				return o1[1] - o2[1];
		});
		for (int i = 0; i < N; i++)
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
	}
}