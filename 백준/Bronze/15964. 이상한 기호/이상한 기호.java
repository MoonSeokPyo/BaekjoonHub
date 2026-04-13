import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15964();
		
		br.close();
		bw.close();
	}
	static void func_15964() throws Exception {
		long[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
		long result = (arr[0] + arr[1]) * (arr[0] - arr[1]);
		bw.write(result + "");
	}
}