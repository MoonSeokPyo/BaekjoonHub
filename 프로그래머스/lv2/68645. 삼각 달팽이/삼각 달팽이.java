class Solution {
    public int[] solution(int n) {
//         int size = 0;
//         for(int i = 1; i <= n; i++){
//             size += i;
//         }
        
//         int[] answer = new int[size];
        
//         int[] dx = {0, 1, -1};
//         int[] dy = {1, 0, -1};
        
//         int[][] arr = new int[n][];
//         for(int i = 0; i < n; i++){
//             arr[i] = new int[i + 1];
//         }
        
//         int direction = 0;
//         int nx = 0, ny = 0;
//         arr[nx][ny] = 1;
//         for(int i = 0; i < size; i++){
//             nx += dx[direction];
//             ny += dy[direction];
//             if(nx < 0 || ny < 0 || ny >= arr.length || nx >= arr[ny].length){
//                 direction = (direction + 1) % 3;
//                 i -= 1;
//                 continue;
//             }
//             arr[ny][nx] = i + 1;
//         }
        
//         int index = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < arr[i].length; j++){
//                 answer[index] = arr[i][j];
//                 index += 1;
//             }
//         }
        
        int size = 0;
        for(int i = 1; i <= n; i++){
            size += i;
        }

        int[] answer = new int[size];

        int[] dx = {0, 1, -1};
        int[] dy = {1, 0, -1};

        int[][] arr = new int[n][];
        for(int i = 0; i < n; i++){
            arr[i] = new int[i + 1];
        }

        int direction = 0;
        int nx = 0, ny = 0;
        arr[nx][ny] = 1;
        for(int i = 1; i < size; i++){
            nx += dx[direction];
            ny += dy[direction];
            if(nx < 0 || ny < 0 || ny >= arr.length || nx >= arr[ny].length || arr[ny][nx] != 0){
                nx -= dx[direction];
                ny -= dy[direction];
                direction = (direction + 1) % 3;
                i -= 1;
                continue;
            }
            arr[ny][nx] = i + 1;
        }

        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < arr[i].length; j++){
                answer[index] = arr[i][j];
                index += 1;
            }
        }
        return answer;
    }
}