import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int[][] array = new int[9][9];
        int max = -1;
        int maxX = 0, maxY = 0;
        
        for (int i = 0; i < 9; i++) {
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            for(int j = 0; j < tokens.length; j++) {
                array[i][j] = Integer.parseInt(tokens[j]);
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(max < array[i][j]) {
                    max = array[i][j];
                    maxX = i + 1;
                    maxY = j + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n");
		sb.append(maxX).append(" ").append(maxY);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
