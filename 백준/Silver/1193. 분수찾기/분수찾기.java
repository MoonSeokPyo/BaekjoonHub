import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		String answer;
		int level = 1, i, j;
		while (cnt - level > 0)
			cnt = cnt - level++;
		
		i = level;
		j = 1;
		
		while(cnt > 1) {
			i--;
			j++;
			cnt--;
		}
		
		if(level % 2 == 0)
			answer = String.format("%d/%d", j, i);
		else
			answer = String.format("%d/%d", i, j);
			
		
		bw.write(answer);
		
		br.close();
		bw.close();
	}
}
