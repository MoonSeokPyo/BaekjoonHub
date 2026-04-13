import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st_1 = new StringTokenizer(br.readLine());
		StringTokenizer st_2 = new StringTokenizer(br.readLine());
		
		Deque<Integer> deque = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			if (st_1.nextToken().equals("0"))
				deque.addLast(Integer.parseInt(st_2.nextToken()));
			else
				st_2.nextToken();
		}

		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num, size = deque.size();
		
		for (int i = 0; i < M; i++) {
			deque.addFirst(Integer.parseInt(st.nextToken()));
			bw.write(deque.pollLast() + " ");
		}
		
		
		br.close();
		bw.close();
	}
}
