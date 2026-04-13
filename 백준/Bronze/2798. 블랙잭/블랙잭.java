
import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2798();
		
		br.close();
		bw.close();
	}
	
	static void func_2798() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N, M;
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int result = 0, sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					for (int k = 0; k < N; k++) {
						if (k != i && k != j)
							sum = arr[i] + arr[j] + arr[k];
							if (sum > result && sum <= M)
								result = sum;
					}
				}
			}
		}
		bw.write(result + "");
	}
}