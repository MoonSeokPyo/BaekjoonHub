import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_5525();
		
		br.close();
		bw.close();
	}
	
	static void func_5525() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		char[] str = br.readLine().toCharArray();
		int cnt = 0;
		int result = 0;
		char before = str[0];
		if (before == 'I')
			cnt = 1;
		int length = str.length;
		for (int i = 1; i < length; i++) {
			if (str[i] == 'I') {
				if (before == 'O')
					cnt++;
				else
					cnt = 1;
			} else {
				if (before == 'I')
					cnt++;
				else
					cnt = 0;
			}
			
			if (cnt == 2 * n + 1) {
				cnt -= 2;
				result++;
			}
			
			before = str[i];
		}
		bw.write(result + "");
	}
}