class Solution {
    public int[] solution(String[] park, String[] routes) {
        // int[] answer = {0, 0};
        int x = 0, y = 0;
        // 북 남 서 동
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int h = park.length;
        int w = park[0].length();
        loop : for(int i = 0 ; i < h; i++){
            for(int j = 0; j < w; j++){
                if(park[i].charAt(j) == 'S'){
                    y = i;
                    x = j;
                    // x = i; y = j;
                    break loop;
                }
            }
        }
        for(String route : routes){
            String[] line = route.split(" ");
            String direction = line[0];
            int distance = Integer.parseInt(line[1]);
            int i = 0;
            // if(direction.equals("n")){}
            switch(route.charAt(0)){
                case 'N':
                    i = 0;
                    break;
                case 'S':
                    i = 1;
                    break;
                case 'W':
                    i = 2;
                    break;
                case 'E':
                    i = 3;
                    break;
                default:
                    break;
            }
            
            int nx = x;
            int ny = y;
            
            for(int step = 1; step <= distance; step++){
                nx += dx[i];
                ny += dy[i];
                // if((nx > -1 && ny > -1 && nx < w && ny < h) && (park[ny].charAt(nx) != 'X')){
                //     continue;
                // }
                // nx = x;
                // ny = y;
                // break;
                
                if(nx < 0 || nx >= w || ny < 0 || ny >= h || park[ny].charAt(nx) == 'X'){
                    nx = x;
                    ny = y;
                    break;
                }
            }
            x = nx;
            y = ny;
        }
        // answer[0] = y;
        // answer[1] = x;
        // return answer;
        return new int[] {y, x};
    }
}