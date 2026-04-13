import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_9654();
		
		br.close();
		bw.close();
	}
	static void func_9654() throws Exception {
		bw.write("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n" + 
				"N2 Bomber      Heavy Fighter  Limited    21        \n" + 
				"J-Type 327     Light Combat   Unlimited  1         \n" + 
				"NX Cruiser     Medium Fighter Limited    18        \n" + 
				"N1 Starfighter Medium Fighter Unlimited  25        \n" + 
				"Royal Cruiser  Light Combat   Limited    4         ");
	}
}