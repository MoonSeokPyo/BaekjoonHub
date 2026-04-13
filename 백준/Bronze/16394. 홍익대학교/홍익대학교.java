import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_16394();
		
		br.close();
		bw.close();
	}
	
	static void func_16394() throws Exception {
		int year = Integer.parseInt(br.readLine());
		bw.write(year - 1946 + "");
	}
}