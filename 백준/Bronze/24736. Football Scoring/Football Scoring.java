import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_24736();
		
		br.close();
		bw.close();
	}
	
	static void func_24736() throws Exception {
		int[] arr1 = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int[] arr2 = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int[] score = { 6, 3, 2, 1, 2};
		int score1 = 0, score2 = 0;
		for (int i = 0; i < score.length; i++) {
			score1 += arr1[i] * score[i];
			score2 += arr2[i] * score[i];
		}
		bw.write(score1 + " " + score2);
	}
}