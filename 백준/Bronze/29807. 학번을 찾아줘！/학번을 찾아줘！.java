import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_29807();
		
		br.close();
		bw.close();
	}
	
	static void func_29807() throws Exception {
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] score = new int[5];
		for (int i = 0; i < t; i++)
			score[i] = Integer.parseInt(st.nextToken());
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		if (score[0] > score[2])
			num1 = (score[0] - score[2]) * 508;
		else
			num1 = (score[2] - score[0]) * 108;
		if (score[1] > score[3])
			num2 = (score[1] - score[3]) * 212;
		else
			num2 = (score[3] - score[1]) * 305;
		if (score[4] != 0)
			num3 = score[4] * 707;
		int num = num1 + num2 + num3;
		num *= 4763;
		bw.write(num + "");
	}
}