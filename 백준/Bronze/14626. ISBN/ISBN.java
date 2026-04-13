import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_14626();
		
		br.close();
		bw.close();
	}
	static void func_14626() throws Exception {
		char[] ch = br.readLine().toCharArray();
		int sum = 0, index = -1, result;
		for (int i = 0; i < 13; i++) {
			if (ch[i] == '*') {
				index = i;
				continue;
			}
			
			if (i % 2 == 0) {
				sum += Character.getNumericValue(ch[i]);
			} else {
				sum += Character.getNumericValue(ch[i]) * 3;
			}
		}
		if (index % 2 == 0) {
			result =  sum % 10 == 0 ? 0 : (10 - (sum % 10));
		} else {
			if (sum % 10 == 0)
				result = 0;
			else {
				result = 10 - (sum % 10);
				switch (result) {
				case 1:
					result = 7;
					break;
				case 2:
					result = 4;
					break;
				case 3:
					result = 1;
					break;
				case 4:
					result = 8;
					break;
				case 5:
					result = 5;
					break;
				case 6:
					result = 2;
					break;
				case 7:
					result = 9;
					break;
				case 8:
					result = 6;
					break;
				case 9:
					result = 3;
					break;
				case 10:
					result = 0;
					break;
				}
			}
		}
		bw.write(result + "");
	}
}