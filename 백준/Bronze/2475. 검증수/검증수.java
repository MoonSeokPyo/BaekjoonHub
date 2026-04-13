import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2475();
		
		br.close();
		bw.close();
	}
	static void func_2475() throws Exception {
		int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i] * arr[i];
		}
		bw.write(result % 10 + "");
	}
}