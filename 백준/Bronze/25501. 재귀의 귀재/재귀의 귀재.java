import java.util.*;
import java.io.*;

public class Main {
	static int cnt;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long T = Integer.parseInt(br.readLine());
		
		String str;
		
		for (int i = 0; i < T; i++) {
			cnt = 0;
			str = br.readLine();
			bw.write(func(str, 0, str.length() - 1) + " " + cnt);
			bw.newLine();
		}
		
		
		br.close();
		bw.close();
	}
	static int func(String str, int head, int tail) {
		cnt++;
		if (head >= tail)
			return 1;
		else if (str.charAt(head) != str.charAt(tail))
			return 0;
		else
			return func(str, head + 1, tail - 1);
	}
}
