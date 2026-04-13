import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] a = Arrays.stream(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
		if (a[0] >= a[1])
			bw.write(Math.abs(a[0] - a[1]) + "");
		else
			bw.write(Math.abs(a[1] - a[0]) + "");
		
		br.close();
		bw.close();
    }
}