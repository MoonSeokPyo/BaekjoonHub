import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_32929();
		
		br.close();
		bw.close();
	}
	
	static void func_32929() throws Exception {
		int x = Integer.parseInt(br.readLine());
		switch (x % 3) {
		case 0:
			bw.write("S");
			break;
		case 1:
			bw.write("U");
			break;
		case 2:
			bw.write("O");
			break;

		default:
			break;
		}
	}
}