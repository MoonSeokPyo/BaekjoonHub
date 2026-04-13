import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1874();
		
		br.close();
		bw.close();
	}
	static void func_1874() throws Exception {
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int index = 0;
		for (int i = 1; i <= n; i++) {
			stack.push(i);
			sb.append('+').append('\n');
			while (!stack.isEmpty() && stack.peek() == arr[index]) {
				stack.pop();
				sb.append('-').append('\n');
				index++;
			}
		}
		if (stack.isEmpty())
			bw.write(sb.toString());
		else
			bw.write("NO");
	}
}