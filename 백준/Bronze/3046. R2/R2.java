import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_3046();
		
		br.close();
		bw.close();
	}
	
	static void func_3046() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r1 = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		bw.write(s * 2 - r1 + "");
	}
}