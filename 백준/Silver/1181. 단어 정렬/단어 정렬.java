import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1181();
		
		br.close();
		bw.close();
	}
	static void func_1181() throws Exception {
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length() == o2.length())
					return o1.compareTo(o2);
				else
					return o1.length() - o2.length();
			}
			
		});
		
		bw.write(arr[0] + "\n");
		for (int i = 1; i < N; i++) {
			if (!arr[i].equals(arr[i - 1]))
				bw.write(arr[i] + "\n");
		}
	}
}