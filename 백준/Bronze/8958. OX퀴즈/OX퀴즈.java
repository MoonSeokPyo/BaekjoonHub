import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_8958();
		
		br.close();
		bw.close();
	}
	static void func_8958() throws Exception {
		int T = Integer.parseInt(br.readLine()), score, cnt;
		String ox;
		for (int i = 0; i < T; i++) {
			ox = br.readLine();
			score = cnt = 0;
			for (int j = 0; j < ox.length(); j++) {
				if(ox.charAt(j) == 'O')
					score += ++cnt;
				else if (j > 0 && ox.charAt(j - 1) == 'O')
					cnt = 0;
			}
			bw.write(score + "\n");
		}
	}
}