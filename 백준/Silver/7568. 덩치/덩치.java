import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_7568();
		
		br.close();
		bw.close();
	}
	static void func_7568() throws Exception {
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int [N][2];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < N; i++) {
			int rank = 1;
			for (int j = 0; j < N; j++) {
				if (arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1])
					rank++;
			}
			bw.write(rank + "\n");
		}
	}
}