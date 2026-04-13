import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_27434();
        
		br.close();
		bw.close();
	}
	static void func_27434() throws Exception {
		int n = Integer.parseInt(br.readLine());
		bw.write(func_27434_factorial(1, n) + "");
	}
	static BigInteger func_27434_factorial(int a, int n) {
		BigInteger num = BigInteger.valueOf(a);
		if (a < n) {
			int mid = (a + n) / 2;
			num = func_27434_factorial(a, mid).multiply(func_27434_factorial(mid + 1, n));
		}
		return num;
	}
}