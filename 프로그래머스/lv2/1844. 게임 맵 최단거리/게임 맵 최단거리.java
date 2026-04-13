import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    boolean[][] visited;
    int answer = -1;
    int[] dx = {0, 0, -1, 1};
    int[] dy = {-1, 1, 0, 0};
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        func(maps, 0, 0, 1);
        return answer;
    }
    // bfs로 해야함
    // void func(int[][] maps, int x, int y, int count){
    //     visited[y][x] = true;
    //     if(y == (maps.length - 1) && x == (maps[0].length - 1) && (answer == -1 || count < answer)){
    //         answer = count;
    //     } else{
    //         int nx;
    //         int ny;
    //         for (int i = 0; i < 4; i++){
    //             nx = x + dx[i];
    //             ny = y + dy[i];
    //             if(nx >= 0 && ny >= 0 && ny < maps.length && nx < maps[0].length && maps[ny][nx] != 0 && !visited[ny][nx]){
    //                 func(maps, nx, ny, count + 1);
    //             }
    //         }
    //     }
    //     visited[y][x] = false;
    // }
    void func(int[][] maps, int x, int y, int count){
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[] {x, y, count});

        while (!deque.isEmpty()) {
            int[] xy = deque.poll();
            x = xy[0];
            y = xy[1];
            count = xy[2];


            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(ny == (maps.length - 1) && nx == (maps[0].length - 1) &&  maps[ny][nx] != 0 && !visited[ny][nx]){
                    answer = count + 1;
                    return;
                } else if (nx >= 0 && ny >= 0 && ny < maps.length && nx < maps[0].length && maps[ny][nx] != 0 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    deque.offer(new int[] {nx, ny, count + 1});
                }
            }
        }
    }
}