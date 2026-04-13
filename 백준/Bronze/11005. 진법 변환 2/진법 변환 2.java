import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		int arr_size = B;
		char[] arr = new char[B];
		String answer = "";
		
		for (int i = 0; i < arr_size; i++)
			if (i < 10)
				arr[i] = (char) ('0' + i);
			else
				arr[i] = (char)('A' + i - 10);
		
		while (N != 0) {
			answer = arr[N % B] + answer; 
			N /= B;
		}
		
		bw.write(answer);
		
		br.close();
		bw.close();
	}
}

