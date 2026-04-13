import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> stack = new ArrayDeque<>();  // 스택
        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());
            if(num == 0){
                stack.pop();
            }else{
                stack.push(num);
            }
        }
        int size = stack.size();
        for(int i = 0; i < size; i++){
            result += stack.pop();
        }
        System.out.println(result);
    }
}
