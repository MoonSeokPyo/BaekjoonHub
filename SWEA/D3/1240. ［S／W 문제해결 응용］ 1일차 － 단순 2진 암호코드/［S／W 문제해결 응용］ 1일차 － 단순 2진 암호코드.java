import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1240();
		
		br.close();
		bw.close();
	}
	
	static void func_1240() throws Exception {
		int[] num = new int[8];
		Context_1240 ct = new Context_1240();
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			String code = null;
			for (int i = 0; i < n; i++) {
				String input = br.readLine();
				if (input.contains("1")) {
					for (int j = m - 1; j >= 0; j--) {
						if (input.charAt(j) == '1') {
							code = input.substring(j - 55, j + 1);
							break;
						}
					}
					for (int j = i + 1; j < n; j++)
						br.readLine();
					break;
				}
			}
			for (int i = 0; i < 8; i++)
				num[i] = func_1240_decryption(ct, code.substring(7 * i, 7 + 7 * i));
			// (홀수 자리의 합 x 3) + (짝수 자리의 합)이 10의 배수
			int result = 0;
			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0)
					result += num[i] * 3;
				else
					result += num[i];
			}
			if (result % 10 == 0) {
				result = 0;
				for (int i = 0; i < 8; i++)
					result += num[i];
			} else {
				result = 0;
			}
			sb.append('#').append(t).append(' ').append(result).append('\n');
		}
		bw.write(sb.toString());
	}
	static class Context_1240{
		// 0 -> 3:2:1:1
		// 1 -> 2:2:2:1
		// 2 -> 2:1:2:2
		// 3 -> 1:4:1:1
		// 4 -> 1:1:2:2
		// 5 -> 1:2:3:1
		// 6 -> 1:1:1:4
		// 7 -> 1:3:1:2
		// 8 -> 1:2:1:3
		// 9 -> 3:1:1:2
		
		String[] code = {
				"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"
		};
	}
	static int func_1240_decryption(Context_1240 ct, String code) {
		for (int i = 0; i < 10; i++) {
			if (code.equals(ct.code[i])) {
				return i;
			}
		}
		return -1;
	}
}