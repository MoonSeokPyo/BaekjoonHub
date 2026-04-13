import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1541();
		
		br.close();
		bw.close();
	}
	
	static void func_1541() throws Exception {
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		List<Integer> num = new ArrayList<>();
		List<Boolean> arithmetic = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				sb.append(input.charAt(i));
			} else if (input.charAt(i) == '+') {
				arithmetic.add(true);
				num.add(Integer.parseInt(sb.toString()));
				sb = new StringBuilder();
			} else if (input.charAt(i) == '-') {
				arithmetic.add(false);
				num.add(Integer.parseInt(sb.toString()));
				sb = new StringBuilder();
			}
		}
		num.add(Integer.parseInt(sb.toString()));
		
		int result = num.get(0);
		int index = 0;
		for (int i = 1; i < num.size(); i++) {
			if (arithmetic.get(index) == true) {
				index++;
				result = result + num.get(i);
			} else {
				index++;
				int tmp = num.get(i);
				for (int j = i + 1; j < num.size(); j++) {
					
					if (arithmetic.get(index) == true) {
						index++;
						tmp = tmp + num.get(j);
					} else {
						break;
					}
					i++;
				}
				result = result - tmp;
			}
		}
		bw.write(result + "");
	}
}