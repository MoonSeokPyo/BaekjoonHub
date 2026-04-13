import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11866();
		
		br.close();
		bw.close();
	}
	static void func_11866() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		List<Integer> list = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		sb.append('<');
		int index = 0;
		while (!list.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				index++;
				if (index == list.size())
					index = 0 ;
			}
			int num = list.remove(index);
			if (list.isEmpty())
				sb.append(num);
			else
				sb.append(num).append(", ");
			if (index == list.size())
				index = 0;
		}
		sb.append('>');
		bw.write(sb.toString());
	}
}