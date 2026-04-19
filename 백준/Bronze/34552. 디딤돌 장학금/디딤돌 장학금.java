import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_34552();
		
		br.close();
		bw.close();
	}
    static void func_34552() throws Exception {
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			double l = Double.valueOf(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			if (s >= 17 && l >= 2.0)
				cnt += arr[b];
		}
		bw.write(cnt + "");
	}
}