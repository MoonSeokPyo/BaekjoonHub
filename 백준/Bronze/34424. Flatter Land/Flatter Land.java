import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_34423();
		
		br.close();
		bw.close();
	}
	
	
	static void func_34423() throws Exception {
		int n = Integer.parseInt(br.readLine()) - 1;
		int x = Integer.parseInt(br.readLine());
		bw.write(n * x + "");
	}
}