import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_9012();
		
		br.close();
		bw.close();
	}
	static void func_9012() throws Exception {
		int t = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		String str;
		StringBuilder sb = new StringBuilder();
		loop : for (int i = 0; i < t; i++) {
			str = br.readLine();
			int length = str.length();
			for (int j = 0; j < length; j++) {
				char ch = str.charAt(j);
				if (ch == '(') {
					stack.add(ch);
				} else if (ch == ')') {
					if (!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					} else {
						sb.append("NO").append('\n');
						stack.clear();
						continue loop;
					}
				}
			}
			if (stack.isEmpty()) 
				sb.append("YES").append('\n');
			else
				sb.append("NO").append('\n');
			stack.clear();
		}
		bw.write(sb.toString());
	}
}