class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        // u, d, l, r
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        int mx, my;
        for(int i = 0; i < keyinput.length; i++){
            switch(keyinput[i].charAt(0)){
                case 'u':
                    mx = answer[0] + dx[0];
                    my = answer[1] + dy[0];
                    break;
                case 'd':
                    mx = answer[0] + dx[1];
                    my = answer[1] + dy[1];
                    break;
                case 'l':
                    mx = answer[0] + dx[2];
                    my = answer[1] + dy[2];
                    break;
                case 'r':
                    mx = answer[0] + dx[3];
                    my = answer[1] + dy[3];
                    break;
                default:
                    mx = answer[0];
                    my = answer[1];
                    break;
            }
            if( (mx >= -(board[0] / 2)) && (mx <= (board[0] / 2)) && (my >= -(board[1] / 2) ) && (my <= (board[1] / 2) ) ){
                answer[0] = mx;
                answer[1] = my;
            }
        }
        
        return answer;
    }
}