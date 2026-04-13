import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_2580();
		
		br.close();
		bw.close();
	}
	static void func_2580() throws Exception {
		int[][] sudoku = new int [9][9];
		for (int i = 0; i < 9; i++)
			sudoku[i] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		List<int[]> blanks = new ArrayList<>();
		// zero check
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (sudoku[i][j] == 0)
					blanks.add(new int[]{i, j});
			}
		}
		
		func_2580_dfs(sudoku, blanks, 0);
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				bw.write(sudoku[i][j] + " ");
			bw.newLine();
		}
	}
	
	static boolean func_2580_dfs(int[][] sudoku, List<int[]> blanks, int idx) throws Exception {
		if (idx == blanks.size())
			return true;
		int y = blanks.get(idx)[0], x = blanks.get(idx)[1];
		for (int i = 1; i <= 9; i++) {
			if (func_2580_isValid(sudoku, blanks.get(idx), i)) {
				sudoku[y][x] = i;
				if (func_2580_dfs(sudoku, blanks, idx + 1))
					return true;
				sudoku[y][x] = 0;
			}
		}
		
		return false;
	}
	static boolean func_2580_isValid(int[][] sudoku, int[] index, int num) {
		int y = index[0], x = index[1];
		
		for (int i = 0; i < 9; i++)
			if (sudoku[y][i] == num)
				return false;
		for (int i = 0; i < 9; i++)
			if (sudoku[i][x] == num)
				return false;
		int hy = (y / 3) * 3, hx = (x / 3) * 3;
		for (int i = hy; i < hy + 3; i++)
			for (int j = hx; j < hx + 3; j++)
				if (sudoku[i][j] == num)
					return false;
		
		return true;
    }
}