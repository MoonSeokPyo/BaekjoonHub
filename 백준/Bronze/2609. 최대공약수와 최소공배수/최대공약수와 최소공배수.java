import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2609();
		
		br.close();
		bw.close();
	}
	
	static void func_2609() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a, b;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		int GCD, LCM;
		int min = Math.min(a, b), max = Math.max(a, b);
		int temp, temp1 = max, temp2 = min;
		while (temp2 !=0) {
			temp = temp1 % temp2;
			temp1 = temp2; 
			temp2 = temp;
		}
		GCD = temp1;
		bw.write(GCD + "\n");
		LCM = (min * max) / GCD;
		bw.write(LCM + "\n");
	}
}