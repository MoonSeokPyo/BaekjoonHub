import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[][] str = new String[20][3];
		
		double average, sum = 0, cnt = 0;
		
		for (int i = 0; i < 20; i++) {
			str[i] = br.readLine().split("\\s+");
			if(str[i][2].equals("P"))
				continue;
			sum += Double.parseDouble(str[i][1]) * score(str[i][2]);
			cnt += Double.parseDouble(str[i][1]);
		}
		
		average = sum / cnt;
		
		bw.write(average + "");
		
		br.close();
		bw.close();
	}
	static double score(String score) {
		switch (score) {
		case "A+":
			return 4.5;
		case "A0":
			return 4.0;
		case "B+":
			return 3.5;
		case "B0":
			return 3.0;
		case "C+":
			return 2.5;
		case "C0":
			return 2.0;
		case "D+":
			return 1.5;
		case "D0":
			return 1.0;

		default:
			return 0.0;
		}
	}
}
