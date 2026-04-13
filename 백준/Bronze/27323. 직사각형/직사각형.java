import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_27323();
		
		br.close();
		bw.close();
	}
	static void func_27323() throws Exception {
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		bw.write(a * b + "");
	}
}