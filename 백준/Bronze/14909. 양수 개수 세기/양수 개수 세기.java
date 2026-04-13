import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_14909();
		
		br.close();
		bw.close();
	}
	
	static void func_14909() throws Exception {
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = st.countTokens();
		for (int i = 0; i < size; i++) {
			String input = st.nextToken();	
			if (input.charAt(0) != '-' && input.charAt(0) != '0')
				cnt++;
		}
		bw.write(cnt + "");
	}
}