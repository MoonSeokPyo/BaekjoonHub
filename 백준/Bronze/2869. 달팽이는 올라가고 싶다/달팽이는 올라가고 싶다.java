import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2869();
		
		br.close();
		bw.close();
	}
	static void func_2869() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), V = Integer.parseInt(st.nextToken());
		int day = 1, meter = 0;
		if(A < V) {
			day += ((V - A) >= (A - B) ? (V - A) / (A - B) + ((V - A) % (A - B) > 0 ? 1 : 0) : 1);
		}
		bw.write(day + "");
	}
}