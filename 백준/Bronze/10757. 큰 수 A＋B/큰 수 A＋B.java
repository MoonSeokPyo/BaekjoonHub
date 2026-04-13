import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10757();
		
		br.close();
		bw.close();
	}
	
	static void func_10757() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		bw.write(a.add(b) + "");
	}
}