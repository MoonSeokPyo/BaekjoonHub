import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_15727();
		
		br.close();
		bw.close();
	}
	static void func_15727() throws Exception {
		int L = Integer.parseInt(br.readLine());
		if (L % 5 == 0)
			bw.write(L / 5 + "");
		else
			bw.write((L / 5 + 1) + "");
	}
}