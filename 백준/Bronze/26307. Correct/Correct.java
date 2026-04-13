import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_26307();
		
		br.close();
		bw.close();
	}
	static void func_26307() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hh = Integer.parseInt(st.nextToken()), mm = Integer.parseInt(st.nextToken());
		bw.write(((hh - 9) * 60 + mm )+ "");
	}
}