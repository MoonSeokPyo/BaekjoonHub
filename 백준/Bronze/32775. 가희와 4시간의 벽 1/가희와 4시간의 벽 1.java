import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_32775();
		
		br.close();
		bw.close();
	}
	
	static void func_32775() throws Exception {
		int s = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		if (s > f)
			bw.write("flight");
		else
			bw.write("high speed rail");
	}
}