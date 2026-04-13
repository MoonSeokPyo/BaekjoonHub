import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int Q, D, N, P;
		// 25, 10, 05, 01
		
		int C;
		
		for (int i = 0; i < T; i++) {
			Q = D = N = P = 0;
			C = Integer.parseInt(br.readLine());
			if (C / 25 > 0) {
				Q = C / 25;
				C = C % 25;
			}
			if (C / 10 > 0) {
				D = C / 10;
				C = C % 10;
			}
			if (C / 5 > 0) {
				N = C / 5;
				C = C % 5;
			}
			if (C / 1 > 0) {
				P = C / 1;
				C = C % 1;
			}
			bw.write(Q + " "+ D + " " + N + " " + P);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}

