import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15829();
		
		br.close();
		bw.close();
	}
	
	static void func_15829() throws Exception {
		int L = Integer.parseInt(br.readLine()), r = 31;
		long sum = 0L;
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			if (i > 10) {
				int j = i;
				long temp = (str.charAt(i) - 'a' + 1);
				while (j > 0) {
					temp *= r;
					temp %= 1234567891;
					j--;
				}
				sum += temp;
                sum %= 1234567891;
				continue;
			}
			sum += (str.charAt(i) - 'a' + 1) * (long)Math.pow(r, i);
			sum %= 1234567891;
		}
		bw.write(sum + "");
	}
}