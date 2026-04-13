import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_4153();
		
		br.close();
		bw.close();
	}
	static void func_4153() throws Exception {
		List<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		list.add(Integer.parseInt(st.nextToken()));
		list.add(Integer.parseInt(st.nextToken()));
		list.add(Integer.parseInt(st.nextToken()));
		
		if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0)
			return;
		
		list.sort(Comparator.naturalOrder());
		if(Math.pow(list.get(2), 2) == Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2))
			bw.write("right\n");
		else
			bw.write("wrong\n");
		
        bw.flush();
        
		func_4153();
	}
}