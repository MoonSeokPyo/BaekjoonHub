import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_30087();
		
		br.close();
		bw.close();
	}
	static void func_30087() throws Exception {
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			switch (br.readLine()) {
			case "Algorithm":
				sb.append(204).append('\n');
				break;
				
			case "DataAnalysis":
				sb.append(207).append('\n');
				break;
				
			case "ArtificialIntelligence":
				sb.append(302).append('\n');
				break;
				
			case "CyberSecurity":
				sb.append("B101").append('\n');
				break;
				
			case "Network":
				sb.append(303).append('\n');
				break;
				
			case "Startup":
				sb.append(501).append('\n');
				break;
				
			case "TestStrategy":
				sb.append(105).append('\n');
				break;

			default:
				break;
			}
		}
		bw.write(sb.toString());
	}
}