import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2744();
		br.close();
		bw.close();
	}
	static void func_2744() throws Exception {
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'a' && str[i] <= 'z')
				str[i] = (char) (str[i] - 32);
			else
				str[i] = (char) (str[i] + 32);
		}
		bw.write(str);
	}
}