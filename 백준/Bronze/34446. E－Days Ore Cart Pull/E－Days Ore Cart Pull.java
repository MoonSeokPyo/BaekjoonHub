import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_34446();
		
		br.close();
		bw.close();
	}
	
	static void func_34446() throws Exception {
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());
		bw.write(2 * m + "");
	}
}