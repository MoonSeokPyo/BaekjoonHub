import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1978();
		
		br.close();
		bw.close();
	}
	static void func_1978() throws Exception {
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				continue;
			cnt++;
			for (int j = 2; j < arr[i]; j++) {
				if(arr[i] % j == 0) {
					cnt--;
					break;
				}
			}
		}
		bw.write(cnt + "");
	}
}