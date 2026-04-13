import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_16430();
		
		br.close();
		bw.close();
	}
	static void func_16430() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		int P = B - A, Q = B;
		bw.write(P + " " + Q);
	}
}