import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_17874();
		
		br.close();
		bw.close();
	}
	
	static void func_17874() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		h = h >= n - h ? h : n - h;
		v = v >= n - v ? v : n - v;
		bw.write(4 * h * v + "");
	}
}