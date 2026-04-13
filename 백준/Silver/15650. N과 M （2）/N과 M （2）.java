import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static boolean[] visit;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static List<Integer> list = new ArrayList<>();
	static int x = 0;
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visit = new boolean[N];
		func();
		bw.close();
	}
	static void func() throws Exception{
		for (int i = 0; i < N; i++) {
			if(!visit[i] && (list.isEmpty() || (!list.isEmpty() && (i + 1) > list.get(list.size() - 1)))) {
				visit[i] = true;
				list.add(i + 1);
				if(list.size() == M) {
					for (int j = 0; j < M; j++) {
						bw.write(list.get(j) + " ");
					}
					bw.newLine();
				} else {
					func();
				}
				list.remove(list.size() - 1);
			}
			visit[i] = false;
		}
	}
}
