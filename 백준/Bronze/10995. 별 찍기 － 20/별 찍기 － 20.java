import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10995();
		
		br.close();
		bw.close();
	}
	
	static void func_10995() throws Exception {
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				for (int j = 0; j < n; j++) {
					sb.append('*').append(' ');
				}
			else
				for (int j = 0; j < n; j++) {
					sb.append(' ').append('*');
				}
			sb.append('\n');
		}
		bw.write(sb.toString());
    }
}