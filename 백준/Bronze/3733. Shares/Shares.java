import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_3733();
		
		br.close();
		bw.close();
	}
	
	static void func_3733() throws Exception {
        String input;
		while ((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input);
			int n  = Integer.parseInt(st.nextToken()) + 1;
			int s  = Integer.parseInt(st.nextToken());
			bw.write(s / n + "\n");
		}
	}
}