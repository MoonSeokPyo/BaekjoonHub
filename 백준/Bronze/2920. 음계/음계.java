import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2920();
		
		br.close();
		bw.close();
	}
	static void func_2920() throws Exception {
		int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		if (arr[0] == 1) {
			for (int i = 1; i <= 8; i++) {
				if (arr[i - 1] != i) {
					bw.write("mixed");
					return;
				}
			}
			bw.write("ascending");
		} else if (arr[0] == 8) {
			for (int i = 8; i >= 1; i--) {
				if (arr[8 - i] != i) {
					bw.write("mixed");
					return;
				}
			}
			
			bw.write("descending");
		} else
			bw.write("mixed");
	}
}