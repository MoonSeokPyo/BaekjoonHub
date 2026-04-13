import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[][] places) {
        // 모든 P 상하좌우에 표시를 해놓고 겹치는 표시가 존재하면 거리두기 실패
        // 마킹? 기법
        ///////////
        int[] answer = new int[places.length];
        // 북, 동, 남, 서
        // 처음만 파티션 확인
        int [][] mx = {{0, -1, 1, 0}, {1, 1, 1, 2}, {0, -1, 1, 0}, {-1, -1, -1, -1}};
        int [][] my = {{-1, -1, -1, -1}, {0, -1, 1, 0}, {1, 1, 1, 2}, {0, -1, 1, 0}};
        loop : for(int i = 0; i < places.length; i++){
            for(int x = 0; x < 5; x++){
                for(int y = 0; y < 5; y++){
                    if(places[i][x].charAt(y) == 'P'){
                        for(int step = 0; step < 4; step++){
                            int nx = x, ny = y;
                            nx += mx[step][0];
                            ny += my[step][0];
                            if(nx < 0 || ny < 0 || nx >= 5 || ny >= 5 || places[i][nx].charAt(ny) == 'X'){
                               continue;
                            }
                            for(int check = 0; check < 4; check++){
                                nx = x;
                                ny = y;
                                nx += mx[step][check];
                                ny += my[step][check];
                                if(nx > -1 && ny > -1 && nx < 5 && ny < 5 && (places[i][nx].charAt(ny) == 'P')){
                                    // answer[i] = 1;
                                    // answer[i] = 0;
                                    continue loop;
                                }
                            }
                        }
                    }
                }
            }
            answer[i] = 1;
        }
        return answer;
    }
}