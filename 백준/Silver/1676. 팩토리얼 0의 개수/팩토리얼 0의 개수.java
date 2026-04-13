import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1676();
		
		br.close();
		bw.close();
	}
	static void func_1676() throws Exception {
		int N = Integer.parseInt(br.readLine());
		long factorial = 1;
		int cnt = 0;
		int zero = 0;
		String F;
		for (int i = 1; i <= N; i++) {
			factorial *= i;
			F = String.valueOf(factorial);
			cnt = 0;
			for (int j = F.length() - 1; j >= 0; j--) {
				if (F.charAt(j) != '0')
					break;
				cnt++;
				zero++;
			}
			factorial = (factorial % (long)Math.pow(10, cnt + 3)) / (long)Math.pow(10, cnt);
		}
		bw.write(zero + "");
	}
}