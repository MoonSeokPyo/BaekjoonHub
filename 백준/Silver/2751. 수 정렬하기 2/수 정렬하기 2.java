import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2751();
		
		br.close();
		bw.close();
	}
	static void func_2751() throws Exception {
		// 10:02
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		for (int i = 0; i < N; i++)
			bw.write(arr[i] + "\n");
	}
}