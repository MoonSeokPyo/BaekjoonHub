import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
        func_31403();
		
		br.close();
		bw.close();
	}
	static void func_31403() throws Exception {
		int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine()), C = Integer.parseInt(br.readLine());
		bw.write((A + B - C) + "\n");
		String AB = String.valueOf(A) + String.valueOf(B);
		bw.write((Integer.parseInt(AB) - C) + "\n");
	}
}