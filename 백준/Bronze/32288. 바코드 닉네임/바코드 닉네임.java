import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_32288();
		
		br.close();
		bw.close();
	}
	
	static void func_32288() throws Exception {
		int n = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		for (int i = 0; i < s.length; i++)
			if (s[i] == 'I')
				s[i] = 'i';
			else
				s[i] = 'L';
		bw.write(String.valueOf(s));
	}
}