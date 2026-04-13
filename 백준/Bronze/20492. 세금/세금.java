import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_20492();
		
		br.close();
		bw.close();
	}
	static void func_20492() throws Exception {
		int n = Integer.parseInt(br.readLine());
		bw.write(((n / 100) * 78) + " " + ((n /100) * 80 + ((((n / 100) * 20) / 100) * 78)));
	}
}