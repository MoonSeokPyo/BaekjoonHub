import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int row, col;
        String[] size = reader.readLine().split(" ");
        row = Integer.parseInt(size[0]);
        col = Integer.parseInt(size[1]);
        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] tokens = reader.readLine().split(" ");
            for(int j = 0; j < col; j++) {
                array[i][j] = Integer.parseInt(tokens[j]);
            }
        }
        for (int i = 0; i < row; i++) {
            String[] tokens = reader.readLine().split(" ");
            for(int j = 0; j < col; j++) {
                array[i][j] += Integer.parseInt(tokens[j]);
            }
        }
        for(int[] i: array) {
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
