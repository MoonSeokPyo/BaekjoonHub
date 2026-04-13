import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_14928();
		
		br.close();
		bw.close();
	}
	static void func_14928() throws Exception {
		String n = br.readLine();
		char[] arr = new char[8];
		for (int i = 0; i < 8; i++)
			arr[i] = n.charAt(i);
		int num = Integer.parseInt(String.valueOf(arr));
		num = num % 20000303;
		for (int i = 8; i < n.length(); i++) {
			num = ((num * 10) + Character.getNumericValue(n.charAt(i))) % 20000303;
		}
		bw.write(num + "");
	}
}