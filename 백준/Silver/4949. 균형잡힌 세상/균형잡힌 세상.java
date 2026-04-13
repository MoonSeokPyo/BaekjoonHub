import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_4949();
		
		br.close();
		bw.close();
	}
	static void func_4949() throws Exception {
		String str = br.readLine();
		if (str.equals("."))
			return;
		int index = -1;
		Stack<Character> stack = new Stack<>();
		int length = str.length();
		while(++index < length) {
			char ch = str.charAt(index);
			if (ch == '[' || ch == '(') {
				stack.add(ch);
			} else if (ch == ']') {
				if (!stack.empty() && stack.peek() == '[')
					stack.pop();
				else {
					bw.write("no\n");
					func_4949();
					return;
				}
			} else if (ch == ')') {
				if (!stack.empty() && stack.peek() == '(')
					stack.pop();
				else {
					bw.write("no\n");
					func_4949();
					return;
				}
			}
		}
		if (stack.empty())
			bw.write("yes\n");
		else
			bw.write("no\n");
		func_4949();
	}
}