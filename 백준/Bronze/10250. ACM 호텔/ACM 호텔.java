import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10250();
		
		br.close();
		bw.close();
	}
	static void func_10250() throws Exception {
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int H, W, N, cnt;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			cnt = 0;
			for (int j = 1; j <= W; j++) {
				for (int k = 1; k <= H; k++) {
					if(++cnt == N)
						if (j < 10)
							bw.write(k + "0" + j + "\n");
						else
							bw.write(k + "" + j + "\n");
				}
			}
		}
	}
}