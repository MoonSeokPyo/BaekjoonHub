import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2495();
		
		br.close();
		bw.close();
	}
	
	static void func_2495() throws Exception {
		for (int i = 0; i < 3; i++) {
			String input = br.readLine();
			int result = 1;
			int cnt = 1;
			for (int j = 1; j < input.length(); j++) {
				if (input.charAt(j) == input.charAt(j - 1)) {
					cnt++;
				} else {
					result = Math.max(result, cnt);
					cnt = 1;
				}
			}
            result = Math.max(result, cnt);
			bw.write(result + "\n");
		}
	}
}