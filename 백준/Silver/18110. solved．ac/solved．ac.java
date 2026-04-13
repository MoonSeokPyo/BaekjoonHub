import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_18110();
		
		br.close();
		bw.close();
	}
	static void func_18110() throws Exception {
		// 02:30
		int n = Integer.parseInt(br.readLine());
		int[] score = new int[n];
		int exception = (int) Math.round(n * 0.15);
		for (int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(score);
		float sum = 0;
		for (int i = exception; i < n - exception; i++) {
			sum += score[i];
		}
		int average = Math.round(sum / (n - (2 * exception)));
		bw.write(average + "");
	}
}