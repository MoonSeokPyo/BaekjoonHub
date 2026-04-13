import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15439();
		
		br.close();
		bw.close();
	}
	
	static void func_15439() throws Exception {
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				cnt++;
			}
		}
		bw.write(cnt + "");
	}
}