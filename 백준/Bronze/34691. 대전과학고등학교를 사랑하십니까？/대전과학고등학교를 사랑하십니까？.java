import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_34691();
		
		br.close();
		bw.close();
	}
	
	static void func_34691() throws Exception {
		String input = br.readLine();
		if (input.equals("animal")) {
			bw.write("Panthera tigris\n");
		} else if (input.equals("tree")) {
			bw.write("Pinus densiflora\n");
		} else if (input.equals("flower")) {
			bw.write("Forsythia koreana\n");
		} else
			return;
		func_34691();
	}
}