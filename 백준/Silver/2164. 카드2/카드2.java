import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2164();
		
		br.close();
		bw.close();
	}
	static void func_2164() throws Exception {
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = N; i > 0; i--) {
			deque.add(i);
		}
		for (int i = N; i > 1; i--) {
			deque.removeLast();
			deque.addFirst(deque.removeLast());
		}
		bw.write(deque.poll() + "");
	}
}