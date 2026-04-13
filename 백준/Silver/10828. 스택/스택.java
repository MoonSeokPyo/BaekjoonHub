import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10828();
		
		br.close();
		bw.close();
	}
	static void func_10828() throws Exception {
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split("\\s+");
			switch (input[0]) {
			case "push":
				stack.add(Integer.parseInt(input[1]));
				break;
			case "pop":
				if (stack.isEmpty())
					bw.write("-1\n");
				else
					bw.write(stack.pop() + "\n");
				break;
			case "size":
				bw.write(stack.size() + "\n");
				break;
			case "empty":
				if (stack.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
				break;
			case "top":
				if (stack.isEmpty())
					bw.write("-1\n");
				else
					bw.write(stack.peek() + "\n");
				break;

			default:
				break;
			}
		}
	}
}