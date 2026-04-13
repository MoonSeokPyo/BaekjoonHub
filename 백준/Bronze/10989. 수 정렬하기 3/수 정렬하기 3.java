import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_10989();
		
		br.close();
		bw.close();
	}
	
	static void func_10989() throws Exception {
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		func_10989_quick(arr, 0, N - 1);
		for (int i = 0; i < N; i++)
			bw.write(arr[i] + "\n");
	}
    static void func_10989_quick(int[] arr, int left, int right) {
		if(left >= right)
			return;
		int i = left, j = right, temp;
		int pivot = arr[(left + right) >>> 1];
		boolean sort = true;
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if(i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (left < j)
			func_10989_quick(arr, left, j);
		if (i < right)
			func_10989_quick(arr, i, right);
    }
}