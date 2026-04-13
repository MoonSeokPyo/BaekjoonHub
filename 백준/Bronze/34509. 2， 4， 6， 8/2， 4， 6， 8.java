import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_34509();
		
		br.close();
		bw.close();
	}
	
	static void func_34509() throws Exception {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if ((j * 10 + i) % 4 == 0 && (i + j) % 6 == 0 && i != 8 && j != 8) {
					bw.write(i * 10 + j + "");
					return;
				}
			}
		}
	}
}