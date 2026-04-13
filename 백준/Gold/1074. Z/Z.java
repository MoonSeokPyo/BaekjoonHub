import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1074();
		
		br.close();
		bw.close();
	}
	
	static void func_1074() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] dy = {0 , 0, 1, 1};
		int[] dx = {0, 1, 0, 1};
		
		bw.write(func_1074_solve(0, n, 0, 0, r, c, dy, dx) + "");
	}
	static int func_1074_solve(int cnt, int n, int y, int x, int r, int c, int[] dy, int[] dx) {
		if (n == 1) {
			for (int i = 0; i < 4; i++) {
				if(y + dy[i] == r && x + dx[i] == c)
					return cnt + i;
			}
		}
		int length = (int)Math.pow(2, n - 1);
		for (int i = 0; i < 4; i++) {
			if (
					r >= y + dy[i] * length && 
					r < y + dy[i] * length + length &&
					c >= x + dx[i] * length &&
					c < x + dx[i] * length + length
					) {
				cnt = func_1074_solve(cnt + i * (int)Math.pow(length, 2), n - 1, y + dy[i] * length, x + dx[i] * length, r, c, dy, dx);
			}
		}
		
		return cnt;
	}
}