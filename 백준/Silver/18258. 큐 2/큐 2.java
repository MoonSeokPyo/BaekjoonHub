import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> queue = new ArrayDeque<>();  // 스택

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            String command = tokens[0];

            if(command.equals("push")) {
                int x = Integer.parseInt(tokens[1]);
                queue.offer(x); //enqueue
                continue;
            } else if(command.equals("pop")) {
                if (queue.isEmpty()) {
//                    System.out.println(-1);
                    result.append(-1);
                } else {
//                    System.out.println(queue.poll());
                    result.append(queue.poll());
                }
            } else if(command.equals("size")) {
//                System.out.println(queue.size());
                result.append(queue.size());
            } else if(command.equals("empty")) {
                if (queue.isEmpty()) {
//                    System.out.println(1);
                    result.append(1);
                } else {
//                    System.out.println(0);
                    result.append(0);
                }
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
//                    System.out.println(-1);
                    result.append(-1);
                } else {
//                    System.out.println(queue.peekFirst());  // queue.peek();
                    result.append(queue.peekFirst());
                }
            } else {
                if (queue.isEmpty()) {
//                    System.out.println(-1);
                    result.append(-1);
                } else {
//                    System.out.println(queue.peekLast());
                    result.append(queue.peekLast());
                }
            }
            result.append("\n");

        }
//        System.out.println(result.toString());
        System.out.println(result);

    }
}
