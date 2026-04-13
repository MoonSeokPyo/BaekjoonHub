import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1259();
		
		
		
		
		br.close();
		bw.close();
	}
	
	static void func_1259() throws Exception {
		String str = br.readLine();
		
		if(Integer.parseInt(str) == 0)
			return;

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt((str.length() - 1) - i)) {
				bw.write("no\n");
				func_1259();
                return;
			}
		}
		bw.write("yes\n");
		func_1259();
	}
}