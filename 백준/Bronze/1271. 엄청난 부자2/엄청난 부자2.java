import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1271();
		
		br.close();
		bw.close();
	}
	static void func_1271() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger n = new BigInteger(st.nextToken());
		BigInteger m = new BigInteger(st.nextToken());
		bw.write(n.divide(m) + "\n" + n.remainder(m));
	}
}