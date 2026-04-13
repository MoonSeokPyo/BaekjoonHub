import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_4766();
		
		br.close();
		bw.close();
	}
	
	static void func_4766() throws Exception {
		StringBuilder sb = new StringBuilder();
		double a, b;
		a = Double.valueOf(br.readLine());
		b = Double.valueOf(br.readLine());
		while(b != 999) {
			sb.append(String.format("%.2f\n", b - a));
			a = b;
			b = Double.valueOf(br.readLine());
		}
		bw.write(sb.toString());
	}
}