import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_34362();
		
		br.close();
		bw.close();
	}
	
	static void func_34362() throws Exception {
		double f = Double.valueOf(br.readLine());
		bw.write(f - 0.3 + "");
	}
}