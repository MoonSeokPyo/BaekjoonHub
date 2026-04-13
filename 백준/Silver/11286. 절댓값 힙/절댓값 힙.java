import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11286();
		
		br.close();
		bw.close();
	}
	
	static void func_11286() throws Exception {
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
			if (Math.abs(a) == Math.abs(b)) {
				return Integer.compare(a, b);
			}
			return Integer.compare(Math.abs(a), Math.abs(b));
			});
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input != 0) {
				heap.offer(input);
			} else {
				if (heap.isEmpty())
					sb.append(0).append('\n');
				else
					sb.append(heap.poll()).append('\n');
			}
		}
		bw.write(sb.toString());
	}
}