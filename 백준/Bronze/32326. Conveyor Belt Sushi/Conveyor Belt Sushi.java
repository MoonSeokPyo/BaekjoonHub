import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_32326();
		
		br.close();
		bw.close();
	}
	
	static void func_32326() throws Exception {
		int r = Integer.parseInt(br.readLine());
		int g = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		bw.write(r * 3 + g * 4 + b * 5 + "");
	}
}