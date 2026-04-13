import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Integer.parseInt(br.readLine());
		
		bw.write(func(n) + "");
		
		br.close();
		bw.close();
	}
	static long func(long n) {
		if(n == 0)
			return 1;
		
		return n * func(n - 1);
	}
}
