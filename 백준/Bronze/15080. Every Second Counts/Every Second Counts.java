import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15080();
		
		br.close();
		bw.close();
	}
	
	static void func_15080() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine(), " : ");
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		int start = hour * 3600 + minute * 60 + second;
		st = new StringTokenizer(br.readLine(), " : ");
		hour = Integer.parseInt(st.nextToken());
		minute = Integer.parseInt(st.nextToken());
		second = Integer.parseInt(st.nextToken());
		int end = hour * 3600 + minute * 60 + second;
		if (end >= start) {
			bw.write(end - start + "");
		} else {
			bw.write(end + 24 * 3600 - start + "");
		}
	}
}