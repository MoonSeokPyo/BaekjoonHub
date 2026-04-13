import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_32498();
		
		br.close();
		bw.close();
	}
	
	static void func_32498() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int score = Integer.parseInt(br.readLine());
			if (score % 2 == 1)
				cnt++;
		}
		bw.write(cnt + "");
	}
}