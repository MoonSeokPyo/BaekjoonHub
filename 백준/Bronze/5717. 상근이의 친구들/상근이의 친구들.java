import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_5717();
		
		br.close();
		bw.close();
	}
	static void func_5717() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()), F = Integer.parseInt(st.nextToken());
		if (M == 0 && F == 0)
			return;
		bw.write(M + F + "\n");
		func_5717();
	}
}