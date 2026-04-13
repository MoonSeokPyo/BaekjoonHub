import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_28691();
		
		br.close();
		bw.close();
	}
	
	static void func_28691() throws Exception {
		String input = br.readLine();
		switch (input) {
		case "M":
			bw.write("MatKor");
			break;
		case "W":
			bw.write("WiCys");
			break;
		case "C":
			bw.write("CyKor");
			break;
		case "A":
			bw.write("AlKor");
			break;
		case "$":
			bw.write("$clear");
			break;

		default:
			break;
		}
	}
}