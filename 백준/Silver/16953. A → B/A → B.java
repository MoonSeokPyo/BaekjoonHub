import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_16953();
		
		br.close();
		bw.close();
	}
	
	static void func_16953() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int cnt = 1;
		while(a < b) {
			if (b % 10 == 1)
				b = (b - 1) / 10;
			else if (b % 2 == 0)
				b /= 2;
			else
				break;
			cnt++;
		}
		if (a == b)
			bw.write(cnt + "");
		else
			bw.write(-1 + "");
	}
}