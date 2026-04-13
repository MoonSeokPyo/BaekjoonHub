import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_9316();
		
		br.close();
		bw.close();
	}
	static void func_9316() throws Exception {
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++)
			bw.write("Hello World, Judge " + i + "!\n");
	}
}