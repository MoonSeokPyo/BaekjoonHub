import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_4101();
		
		
		
		
		
		br.close();
		bw.close();
	}
	static void func_4101() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		if (a == 0 && b == 0)
			return;
		if (a > b)
			bw.write("Yes\n");
		else
			bw.write("No\n");
		func_4101();
	}
}