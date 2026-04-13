import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        List<List<Integer>> graph = new ArrayList<>();

        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String[] tokens = reader.readLine().split(" ");
            int v1 = Integer.parseInt(tokens[0]);
            int v2 = Integer.parseInt(tokens[1]);
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        find(graph, visited, 1);
        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            if(visited[i] == true){
                count += 1;
            }
        }
        System.out.println(count - 1);
    }
    static void find(List<List<Integer>> graph, boolean[] visited, int n){
        visited[n] = true;
        for (int i = 0; i < graph.get(n).size(); i++) {
            if(visited[graph.get(n).get(i)] == false){
                find(graph, visited, graph.get(n).get(i));
            }
        }

    }
}
