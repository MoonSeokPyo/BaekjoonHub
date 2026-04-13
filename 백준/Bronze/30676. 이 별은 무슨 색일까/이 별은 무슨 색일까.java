import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_30676();
		
		br.close();
		bw.close();
	}
	
	static void func_30676() throws Exception {
		int n = Integer.parseInt(br.readLine());
		if (n>= 620 && n <= 780) {
			bw.write("Red");
		} else if (n>= 590 && n < 620) {
			bw.write("Orange");
		} else if (n>= 570 && n < 590) {
			bw.write("Yellow");
		} else if (n>= 495 && n < 570) {
			bw.write("Green");
		} else if (n>= 450 && n < 495) {
			bw.write("Blue");
		} else if (n>= 425 && n < 450) {
			bw.write("Indigo");
		} else if (n>= 380 && n < 425) {
			bw.write("Violet");
		}
	}
}