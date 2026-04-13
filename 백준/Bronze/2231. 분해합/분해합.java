import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2231();
		
		br.close();
		bw.close();
	}
	
	static void func_2231() throws Exception {
		String num = br.readLine(), temp;
		int result = 0, n = Integer.parseInt(num), sum;
		for (int i = 1; i <= n; i++) {
			sum = i;
			temp = String.valueOf(i);
			for (int j = 0; j < temp.length(); j++) {
				sum += Character.getNumericValue(temp.charAt(j));
			}
			if (sum == n) {
				result = i;
				break;
			}
		}
		bw.write(result + "");
	}
}