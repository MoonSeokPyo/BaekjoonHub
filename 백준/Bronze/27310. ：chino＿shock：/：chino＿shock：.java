import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_27310();
		
		br.close();
		bw.close();
	}
	static void func_27310() throws Exception {
		String s = br.readLine();
		int n = s.length();
		int cnt = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == ':')
				cnt++;
		n += cnt;
		cnt = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == '_')
				cnt++;
		n += cnt * 5;
		bw.write(n + "");
	}
}