import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10814();
		
		br.close();
		bw.close();
	}
	static void func_10814() throws Exception {
		int N = Integer.parseInt(br.readLine());
		StringBuilder[] sb = new StringBuilder[201];
		for (int i = 0; i < 201; i++)
			sb[i] = new StringBuilder();
		StringTokenizer st;
		int age;
		String name;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			age = Integer.parseInt(st.nextToken());
			name = st.nextToken();
			sb[age].append(age).append(" ").append(name).append("\n");
		}
		for (StringBuilder str : sb)
			bw.write(str + "");
	}
}