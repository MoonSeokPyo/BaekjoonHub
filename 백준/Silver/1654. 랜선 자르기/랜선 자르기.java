import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1654();
		
		br.close();
		bw.close();
	}
	
	static void func_1654() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] lan = new int[k];
		int max = 0;
		for (int i = 0; i < k; i++) {
			lan[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, lan[i]);
		}
		bw.write(func_1654_binary_search(lan, n, 1, max) + "");
		
	}
	static int func_1654_binary_search(int[] lan, int n, long start, long end) {
		long length = 0;
		while(start <= end) {
			long mid = (start + end) / 2;
			int lancnt = func_1654_count(lan, mid);
			if (lancnt >= n) {
				length = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return (int) length;
	}
	static int func_1654_count(int[] lan, long length) {
		int cnt = 0;
		for (int i : lan) {
			cnt += i / length;
		}
		return cnt;
	}
}