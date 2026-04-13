import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_29863();
		
		br.close();
		bw.close();
	}
	
	static void func_29863() throws Exception {
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		if (a > b) {
			bw.write(24 - a + b + "");
		} else {
			bw.write(b - a + "");
		}
	}
}