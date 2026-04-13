import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10845();
		
		br.close();
		bw.close();
	}
	static void func_10845() throws Exception {
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split("\\s+");
			switch (input[0]) {
			case "push":
				deque.add(Integer.parseInt(input[1]));
				break;
			case "pop":
				if (deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(deque.removeFirst() + "\n");
				break;
			case "size":
				bw.write(deque.size() + "\n");
				break;
			case "empty":
				if (deque.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
				break;
			case "front":
				if (deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(deque.getFirst() + "\n");
				break;
			case "back":
				if (deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(deque.getLast() + "\n");
				break;

			default:
				break;
			}
		}
	}
}