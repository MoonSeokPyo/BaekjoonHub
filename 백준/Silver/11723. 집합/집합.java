import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_11723();
		
		br.close();
		bw.close();
	}
	static void func_11723() throws Exception {
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < m; i++) {
			String[] str = br.readLine().split("\\s+");
			int num;
			switch (str[0]) {
			case "add":
				set.add(Integer.parseInt(str[1]));
				break;
			case "remove":
				num = Integer.parseInt(str[1]);
				if (set.contains(num))
					set.remove(num);
				break;
			case "check":
				num = Integer.parseInt(str[1]);
				if (set.contains(num))
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;
			case "toggle":
				num = Integer.parseInt(str[1]);
				if (set.contains(num))
					set.remove(num);
				else
					set.add(num);
				break;
			case "all":
				for (int j = 1; j <= 20; j++)
					set.add(j);
				break;
			case "empty":
				set.clear();
				break;

			default:
				break;
			}
		}
		bw.write(sb.toString());
	}
}