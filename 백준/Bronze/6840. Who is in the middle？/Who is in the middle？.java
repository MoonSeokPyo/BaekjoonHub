import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_6840();
		
		br.close();
		bw.close();
	}
	
	static void func_6840() throws Exception {
		int a, b, c;
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		bw.write((a > b ? a > c ? b > c ? b : c : a : b > c ? a > c ? a : c : b) + "");
	}
}