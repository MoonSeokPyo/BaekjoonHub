import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_3053();
		
		br.close();
		bw.close();
	}
	
	static void func_3053() throws Exception {
		double r = Integer.parseInt(br.readLine());
		bw.write(String.format("%.6f\n", (r * r * Math.PI)));
		bw.write(String.format("%.6f\n", (r * r * 2)));
	}
}