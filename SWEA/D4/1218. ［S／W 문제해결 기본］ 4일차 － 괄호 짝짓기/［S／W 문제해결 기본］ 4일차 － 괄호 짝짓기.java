import java.util.*;
import java.io.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		func_1218();
		
		br.close();
		bw.close();
	}
	
	// 괄호 짝짓기
	static void func_1218() throws Exception {
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Character> s = new ArrayDeque<>();
		Map<Character, Character> m = new HashMap<>();
		m.put('(', ')');
		m.put('[', ']');
		m.put('{', '}');
		m.put('<', '>');
		for (int tc = 1; tc <= 10; tc++) {
			int length = Integer.parseInt(br.readLine());
			String input = br.readLine();
			s.clear();
			for (int i = 0; i < length; i++) {
				char ch = input.charAt(i);
				if (!s.isEmpty() && m.containsKey(s.peekFirst()) && m.get(s.peekFirst()) == ch) {
					s.pop();
				} else {
					s.push(ch);
				}
			}
			if (s.isEmpty())
				sb.append('#').append(tc).append(' ').append(1).append('\n');
			else
				sb.append('#').append(tc).append(' ').append(0).append('\n');
		}
		bw.write(sb.toString());
	}
}