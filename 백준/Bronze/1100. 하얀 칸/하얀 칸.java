import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int answer = 0;
        String[] row = new String[8];
        for (int i = 0; i < 8; i++) {
            row[i] = reader.readLine();
        }
        for(int i = 0; i < 8; i++){
            int n = i % 2;
            for(int j = n; j < 8; j += 2){
                if(row[i].charAt(j) == 'F'){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
