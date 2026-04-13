import java.util.*;
import java.io.*;

public class Main {
	static int cnt, num, K;
	static int[] temp;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		temp = new int[arr.length];
		cnt = 0;
		num = -1;
		
		func(arr, 0, arr.length - 1);
		
		bw.write(num + "");
		
		br.close();
		bw.close();
	}
	static void func(int[] arr, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			func(arr, p, q);
			func(arr, q + 1, r);
			merge(arr, p, q, r);
		}
	}
	static void merge(int[] arr, int p, int q, int r) {
		int i = p, j = q + 1, t = 0;
		
		while(i <= q && j <= r)
			if(arr[i] <= arr[j])
				temp[t++] = arr[i++];
			else
				temp[t++] = arr[j++];
		
		while (i <= q)
			temp[t++] = arr[i++];
		while (j <= r)
			temp[t++] = arr[j++];
		
		i = p;
		t = 0;
		
		while (i <= r) {
			arr[i++] = temp[t++];
			cnt++;
			if (cnt == K)
				num = temp[t - 1];
		}
	}
}
