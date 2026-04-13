import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_34281();
		
		br.close();
		bw.close();
	}
	
	static void func_34281() throws Exception {
		int w = Integer.parseInt(br.readLine());
		int l = Integer.parseInt(br.readLine());
		bw.write(w * l + "");
	}
}