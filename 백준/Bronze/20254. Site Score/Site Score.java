import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_20254();
		
		br.close();
		bw.close();
	}
	static void func_20254() throws Exception {
		int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		bw.write(arr[0] * 56 + arr[1] * 24 + arr[2] * 14 + arr[3] * 6 + "");
	}
}