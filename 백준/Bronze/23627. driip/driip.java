import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_23627();
		
		br.close();
		bw.close();
	}
	
	static void func_23627() throws Exception {
		String input = br.readLine();
		if (input.length() >= 5)
			input = input.substring(input.length() - 5);
		if (input.equals("driip"))
			bw.write("cute");
		else
			bw.write("not cute");
	}
}