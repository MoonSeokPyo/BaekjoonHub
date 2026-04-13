import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2839();
		
		br.close();
		bw.close();
	}
	static void func_2839() throws Exception {
		int N = Integer.parseInt(br.readLine());
		int answer = -1;
		loop : for (int i = 0; i <= N / 3; i++) {
			for (int j = 0; j <= N / 5; j++) {
				if ((i * 3) + (j * 5) == N) {
					answer = i + j;
					break loop;
				}
			}
		}
		bw.write(answer + "");
	}
}