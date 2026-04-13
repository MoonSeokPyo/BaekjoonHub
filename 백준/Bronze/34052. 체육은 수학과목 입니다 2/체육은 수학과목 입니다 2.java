import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_34052();
		
		br.close();
		bw.close();
	}
	
	static void func_34052() throws Exception {
		int sec = 1800;
		sec -= Integer.parseInt(br.readLine());
		sec -= Integer.parseInt(br.readLine());
		sec -= Integer.parseInt(br.readLine());
		sec -= Integer.parseInt(br.readLine());
		sec -= 300;
		bw.write(sec >= 0 ? "Yes" : "No");
	}
}