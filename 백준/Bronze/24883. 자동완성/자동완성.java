import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_24883();
		
		br.close();
		bw.close();
	}
	
	static void func_24883() throws Exception {
		String input = br.readLine().toLowerCase();
		if (input.charAt(0) == 'n')
			bw.write("Naver D2");
		else
			bw.write("Naver Whale");
	}
}