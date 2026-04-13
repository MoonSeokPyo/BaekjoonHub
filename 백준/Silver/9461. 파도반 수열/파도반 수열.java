import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_9461();
		
		br.close();
		bw.close();
	}
	
	static void func_9461() throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			long[] length = new long[6];
			length[0] = length[2] = length[4] = 1;
			long Pn = 1;
			int index = 0;
			for (int j = 2; j <= n; j++) {
				Pn = length[index];
				length[index] = 0;
				switch (index) {
				case 0:
					length[1] += Pn;
					length[3] += Pn;
					index = 1;
					break;
				case 1:
					length[0] += Pn;
					length[2] += Pn;
					index = 2;
					break;
				case 2:
					length[1] += Pn;
					length[5] += Pn;
					index = 5;
					break;
				case 3:
					length[0] += Pn;
					length[4] += Pn;
					index = 0;
					break;
				case 4:
					length[3] += Pn;
					length[5] += Pn;
					index = 3;
					break;
				case 5:
					length[4] += Pn;
					length[2] += Pn;
					index = 4;
					break;
				}
			}
			sb.append(Pn).append('\n');
		}
		bw.write(sb.toString());
	}
}