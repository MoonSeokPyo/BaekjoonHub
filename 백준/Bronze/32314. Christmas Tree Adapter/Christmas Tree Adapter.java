import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_32314();
		
		br.close();
		bw.close();
	}
	
	static void func_32314() throws Exception {
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		bw.write((w / v >= a ? 1 : 0) + "");
	}
}