import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2108();
		
		br.close();
		bw.close();
	}
	static void func_2108() throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		long sum = 0;
		TreeMap<Integer, Integer> treemap = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (treemap.containsKey(arr[i])) {
				treemap.replace(arr[i], treemap.get(arr[i]) + 1);
			} else {
				treemap.put(arr[i], 1);
			}
		}
		int num = 0, cnt = 0, min = 0;
		for (Integer i : treemap.keySet()) {
			if (treemap.get(i) > cnt) {
				cnt = treemap.get(i);
				num = min = i;
			} else if (treemap.get(i) == cnt) {
				if (min == num)
					num = i;
			}
		}
		int average = (int) Math.round(sum / (double)n);
		int middle = arr[arr.length / 2];
		int high_frequency = num;
		int range = arr[arr.length - 1] - arr[0];
		bw.write(average + "\n" + middle + "\n" + high_frequency + "\n" + range);
	}
}