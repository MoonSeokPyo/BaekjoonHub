import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		String str;
		boolean[] ch , init = new boolean['z' - 'a'  + 1];
		
		loop : for (int i = 0; i < n; i++) {
			ch = init.clone();
			str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				if (ch[str.charAt(j) - 'a'] == true) {
					continue loop;
				} else if(j + 1 < str.length() && str.charAt(j) != str.charAt(j + 1)){
					ch[str.charAt(j) - 'a'] = true;
				}
			}
			cnt++;
		}
		
		bw.write(cnt + "");
		
		br.close();
		bw.close();
	}
}
