import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15680();
		
		br.close();
		bw.close();
	}
	static void func_15680() throws Exception {
		int N = Integer.parseInt(br.readLine());
		if (N == 0)
			bw.write("YONSEI");
		else if (N == 1)
			bw.write("Leading the Way to the Future");
	}
}