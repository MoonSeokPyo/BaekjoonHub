import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[][] square = new int[100][100];
        int result = 0;
        
        int count = Integer.parseInt(reader.readLine());
        int[][] paper = new int[count][2];
        
        for (int i = 0; i < count; i++) {
            String[] tokens = reader.readLine().split(" ");
            paper[i][0] = Integer.parseInt(tokens[0]);
            paper[i][1] = Integer.parseInt(tokens[1]);
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    square[ paper[i][0] + j ][ paper[i][1] + k ] = 1;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                result += square[i][j];
            }
        }
        System.out.println(result);
    }
}
