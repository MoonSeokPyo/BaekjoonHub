import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
		for (int i = 1; i <= num; i++) {
			bw.write(i + "");
            bw.newLine();
		}
		br.close();
		bw.close();
    }
}