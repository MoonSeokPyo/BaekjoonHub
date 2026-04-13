import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_27294();
		
		br.close();
		bw.close();
	}
	
	static void func_27294() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		if (s == 1 || t < 12 || t > 16)
			bw.write("280");
        else
			bw.write("320");
	}
}