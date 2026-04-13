import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2447();
		
		br.close();
		bw.close();
	}
	static void func_2447() throws Exception {
		int N = Integer.parseInt(br.readLine());
		char[][] init = {
				{'*', '*', '*'},
				{'*', ' ', '*'},
				{'*', '*', '*'}
				};
		char[][] arr = new char[N][N];
        for (int i = 0; i < N; i++)
			Arrays.fill(arr[i], ' ');
		func_2447_draw(init, arr, N, 0, 0);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.write(arr[i][j]);
			}
			bw.newLine();
		}
	}
	static void func_2447_draw(char[][] init, char[][] arr, int n, int y, int x) {
		if (n == 3) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					arr[y + i][x + j] = init[i][j];
				}
			}
			return; 
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
                if(i == 1 && j == 1)
					continue;
				int N = n / 3;
				func_2447_draw(init, arr, N, y + (N * i), x + (N * j));
			}
		}
	}
}