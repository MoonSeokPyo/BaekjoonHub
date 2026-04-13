import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_31734();
		
		br.close();
		bw.close();
	}
	static void func_31734() throws Exception {
			int n = Integer.parseInt(br.readLine());
			if (n % 2 == 0) {
				bw.write("SciComLove");
			} else {
				bw.write("evoLmoCicS");
			}
	}
}