import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_5430();
		
		br.close();
		bw.close();
	}
	
	static void func_5430() throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			Deque<Integer> dq = new ArrayDeque<>();
			boolean reverse = false;
			boolean error = false;
			String command = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String inputArr = br.readLine();
			inputArr = inputArr.substring(1, inputArr.length() - 1);
			if (inputArr.length() > 0) {
				int[] arr = Arrays.stream(inputArr.split(",")).mapToInt(Integer::parseInt).toArray();
				for (int j = 0; j < arr.length; j++) {
					dq.offer(arr[j]);
				}
			}
			
			for (int j = 0; j < command.length(); j++) {
				if (command.charAt(j) == 'R') {
					if (reverse)
						reverse = false;
					else
						reverse = true;
				} else {
					if (dq.isEmpty()) {
						error = true;
						break;
					}
					if (reverse)
						dq.pollLast();
					else
						dq.pollFirst();
				}
			}
			if (error) {
				sb.append("error").append('\n');
				continue;
			}
			sb.append('[');
			if (reverse) {
				while (!dq.isEmpty()) {
					sb.append(dq.pollLast());
					if (!dq.isEmpty())
						sb.append(',');
				}
			} else {
				while (!dq.isEmpty()) {
					sb.append(dq.pollFirst());
					if (!dq.isEmpty())
						sb.append(',');
				}
			}
			sb.append(']').append('\n');
		}
		bw.write(sb.toString());
	}
}