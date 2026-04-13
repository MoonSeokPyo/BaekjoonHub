import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2386();
		
		br.close();
		bw.close();
	}
	
	static void func_2386() throws Exception {
		String str = br.readLine();
		if (str.equals("#"))
			return;
		
		String[] arr = str.split("\\s+", 2);
		arr[1] = arr[1].toLowerCase();
		int cnt = 0;
		for (int i = 0; i < arr[1].length(); i++) {
			if (arr[1].charAt(i) == arr[0].charAt(0))
				cnt++;
		}
		bw.write(arr[0] + " "+ cnt + "\n");
		func_2386();
	}
}