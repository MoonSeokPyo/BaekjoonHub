import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split("\\s+");
		int B = Integer.parseInt(str[1]), result = 0, num, size = str[0].length();
		
		for (int i = size - 1; i >= 0; i--) {
			if(str[0].charAt(i) >= 'A' && str[0].charAt(i) <= 'Z') {
				num = str[0].charAt(i) - 'A' + 10;
			} else
				num = str[0].charAt(i) - '0';
			result += num * (int)Math.pow(B, size - i -1);
		}
		
		bw.write(result + "");
		
		br.close();
		bw.close();
	}
}
