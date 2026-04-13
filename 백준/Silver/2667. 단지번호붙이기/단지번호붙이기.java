import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};

    private static int[][] graph;
    private static boolean[][] visited;

    private static int num = 0;

    private static List<Integer> count = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());

        graph = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("");
            for(int j = 0; j < tokens.length; j++){
                graph[i][j] = Integer.parseInt(tokens[j]);
            }
        }

//        System.out.println(Arrays.deepToString(graph));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(graph[i][j] == 1 && !visited[i][j]) {
                    num += 1;
                    count.add(0);
                    dfs(i, j);
                }
            }
        }

        System.out.println(num);
        Collections.sort(count);
        for (int i = 0; i < count.size(); i++) {
            System.out.println(count.get(i));
        }

    }
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        graph[x][y] = num;
        count.set(num -1, count.get(num - 1) + 1);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || ny >= graph.length || nx >= graph[ny].length || visited[nx][ny] || graph[nx][ny] != 1) {
                continue;
            }
            dfs(nx, ny);
        }
    }
}
