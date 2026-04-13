import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_30804();
        
		br.close();
		bw.close();
	}
	
	static void func_30804() throws Exception {
        int n = Integer.parseInt(br.readLine());
		int[] fruits = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			fruits[i] = Integer.parseInt(st.nextToken());
		
		int[] cnt = new int[10];
		int result = 0;
		int left = 0;
		int kind = 0;
		for (int right = 0; right < n; right++) {
			if (cnt[fruits[right]] == 0)
				kind++;
			cnt[fruits[right]]++;
			while(kind > 2) {
				cnt[fruits[left]]--;
				if (cnt[fruits[left]] == 0)
					kind--;
				left++;
					
			}
			result = Math.max(result, right - left + 1);
		}
		bw.write(result + "");
	}
}