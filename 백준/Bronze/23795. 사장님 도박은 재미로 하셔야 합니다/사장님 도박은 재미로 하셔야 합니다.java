import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_23795();
		
		br.close();
		bw.close();
	}
	
	static void func_23795() throws Exception {
		int cnt = 0;
		int input = Integer.parseInt(br.readLine());
		while(input != -1) {
			cnt += input;
			input = Integer.parseInt(br.readLine());
		}
		bw.write(cnt + "");
	}
}