import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), result = 1;
		for (int i = 0; i < num; i++) {
			result *= i + 1;
		}
		bw.write(result + "");
		br.close();
		bw.close();
    }
}