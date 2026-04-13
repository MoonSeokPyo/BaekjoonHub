import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_30802();
		
		br.close();
		bw.close();
	}
	static void func_30802() throws Exception {
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken()), 
				M = Integer.parseInt(st.nextToken()), 
				L = Integer.parseInt(st.nextToken()), 
				XL = Integer.parseInt(st.nextToken()), 
				XXL = Integer.parseInt(st.nextToken()), 
				XXXL = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()), 
				P = Integer.parseInt(st.nextToken());
		
		int T_cnt = 0;
		T_cnt += (S / T) + (S % T == 0 ? 0 : 1);
		T_cnt += (M / T) + (M % T == 0 ? 0 : 1);
		T_cnt += (L / T) + (L % T == 0 ? 0 : 1);
		T_cnt += (XL / T) + (XL % T == 0 ? 0 : 1);
		T_cnt += (XXL / T) + (XXL % T == 0 ? 0 : 1);
		T_cnt += (XXXL / T) + (XXXL % T == 0 ? 0 : 1);
		
		bw.write(T_cnt + "\n");
		bw.write((N / P) + " " + (N % P));
	}
}