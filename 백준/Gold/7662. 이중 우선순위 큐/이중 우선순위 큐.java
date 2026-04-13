import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_7662();
		
		br.close();
		bw.close();
	}
	
	static void func_7662() throws Exception {
		StringBuilder sb = new StringBuilder();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			for (int j = 0; j < k; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String command = st.nextToken();
				int input = Integer.parseInt(st.nextToken());
				switch (command) {
				case "I":
					map.put(input, map.getOrDefault(input, 0) + 1);
					break;
				case "D":
					if (!map.isEmpty()) {
						if (input == 1) {
							map.replace(map.lastKey(), map.get(map.lastKey()) - 1);
							if (map.get(map.lastKey()) == 0)
								map.pollLastEntry();
						} else {
							map.replace(map.firstKey(), map.get(map.firstKey()) - 1);
							if (map.get(map.firstKey()) == 0)
								map.pollFirstEntry();
						}
					}
					break;
				default:
					break;
				}
			}
			if (map.isEmpty())
				sb.append("EMPTY").append('\n');
			else
				sb.append(map.lastKey()).append(' ').append(map.firstKey()).append('\n');
			map.clear();
		}
		bw.write(sb.toString());
	}
}