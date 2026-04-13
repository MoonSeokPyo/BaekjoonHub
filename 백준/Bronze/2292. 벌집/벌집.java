import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int i = 1, num = 1;
		while(num < N) {
			num += (++i - 1) * 6;
		}
		bw.write(i + "");
		br.close();
		bw.close();
	}
}
