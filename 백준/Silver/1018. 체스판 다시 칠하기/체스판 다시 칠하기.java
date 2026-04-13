import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] size = reader.readLine().split(" ");
        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        int[][] board = new int[row][col];  // W -> 0, B -> 1
        int[][] countChW = new int[row][col];
        int[][] countChB = new int[row][col];
        int countW = 64, countB = 64; // 8 * 8

        for (int i = 0; i < row; i++) {
            String line = reader.readLine();
            for (int j = 0; j < col; j++) {
                board[i][j] = line.charAt(j) == 'W' ? 0 : 1;
            }
        }
        // 0, 0 -> W
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(((i + j) % 2 == 0) && board[i][j] == 1) {
                    countChW[i][j] = 1;
                } else if(((i + j) % 2 == 1) && board[i][j] == 0){
                    countChW[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {
                int countNum = 0;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if(countChW[x][y] == 1){
                            countNum++;
                        }
                    }
                }
                if(countW > countNum){
                    countW = countNum;
                }
            }
        }

        // 0, 0 -> B
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(((i + j) % 2 == 0) && board[i][j] == 0) {
                    countChB[i][j] = 1;
                } else if(((i + j) % 2 == 1) && board[i][j] == 1){
                    countChB[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {
                int countNum = 0;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if(countChB[x][y] == 1){
                            countNum++;
                        }
                    }
                }
                if(countB > countNum){
                    countB = countNum;
                }
            }
        }
        
        System.out.println(Math.min(countW, countB));
    }
}
