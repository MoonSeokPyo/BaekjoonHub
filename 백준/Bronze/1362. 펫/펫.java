import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1362();
		
		br.close();
		bw.close();
	}
	
	static void func_1362() throws Exception {
		int num = 0;
		while(true) {
			num++;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			if(o == 0 && w == 0)
				return;
			boolean dead = false;
			st = new StringTokenizer(br.readLine());
			char input = st.nextToken().charAt(0);
			int n = Integer.parseInt(st.nextToken());
			while(input != '#') {
				if(!dead && input == 'E')
					w -= n;
				else
					w += n;
				if(w <= 0)
					dead = true;
				st = new StringTokenizer(br.readLine());
				input = st.nextToken().charAt(0);
				n = Integer.parseInt(st.nextToken());
			}
			if(dead)
				bw.write(num + " RIP\n");
			else
				if(w > o / 2 && w < 2 * o)
					bw.write(num + " :-)\n");
				else
					bw.write(num + " :-(\n");
		}
	}
}