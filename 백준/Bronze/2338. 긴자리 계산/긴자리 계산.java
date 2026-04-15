import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2338();
		
		br.close();
		bw.close();
	}
	
	static void func_2338() throws Exception {
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		bw.write(a.add(b) + "\n" + a.subtract(b) + "\n" + a.multiply(b));
	}
}