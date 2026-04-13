import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_28702();
		
		br.close();
		bw.close();
	}
	static void func_28702() throws Exception {
		String[] str = new String[3];
		int num, index = -1;
		String result;
		for (int i = 0; i < 3; i++) {
			str[i] = br.readLine();
			try {
				num = Integer.parseInt(str[i]);
				index = i;
				num += 3 - i;
				if (num % 3 == 0 && num % 5 == 0)
					result = "FizzBuzz";
				else if (num % 3 == 0)
					result = "Fizz";
				else if (num % 5 == 0)
					result = "Buzz";
				else
					result = String.valueOf(num);
				bw.write(result);
				return;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}