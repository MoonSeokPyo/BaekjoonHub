import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11650();
		
		
		br.close();
		bw.close();
	}
	static void func_11650() throws Exception {
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, (int[] o1, int[] o2) -> {
			if (o1[0] == o2[0])
				return o1[1] - o2[1];
			else
				return o1[0] - o2[0];
		});
		for (int i = 0; i < N; i++)
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
	}
}