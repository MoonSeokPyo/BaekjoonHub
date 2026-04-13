import java.util.*;
public class Main {
	static int x = 0, y = 0;
	static boolean[] ch; 
	static int n, m;
	static int[][] arr;
	static int cnt = 1;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ch = new boolean[n];
		for (int i = 0; i < m; i++) {
			cnt *= n - i;
		}
		arr = new int[cnt][m];
        
		int[] temp = new int[m];
		func(temp, 0);
		
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void func(int[] temp, int index) {
		for (int i = 0; i < n; i++) {
			if(!ch[i]) {
				ch[i] = true;
				temp[index++] = i + 1;
				if(index == m && y < cnt) {
					arr[y++] = temp.clone();
				} else if(index < m) {
					func(temp, index);
				}
				temp[--index] = 0;
				ch[i] = false;
			}
		}
	}
}
