import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int dot = 4, line = 4, square;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			square = (int)Math.pow(4, i);
			dot += line + square;
			line = (line * 2) + (4 * square);
		}
		
		bw.write(dot + "");
		
		br.close();
		bw.close();
	}
}
