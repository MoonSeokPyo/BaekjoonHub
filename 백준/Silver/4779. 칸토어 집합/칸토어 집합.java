import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		char[] str;
		int N, length;
		while((input = br.readLine()) != null) {
			N = Integer.parseInt(input);
			length = (int)Math.pow(3, N);
			str = new char[length];
			for (int i = 0; i < length; i++) {
				str[i] = '-';
			}
			func(str, N, 0, length);
			bw.write(str);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	static void func(char[] str,int N, int l, int m) {
		if (N > 0) {
			int middle = ((m - l) / 3), start = l + middle, end = start + middle;
			for (int i = start; i < end; i++) {
				str[i] = ' ';
			}
			func(str, N - 1, l, start);
			func(str, N - 1, end, m);
		}
	}
}

