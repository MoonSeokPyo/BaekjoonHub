import java.util.*;
class Solution {
    int answer = Integer.MAX_VALUE;
    int[] stages;
    int[][] cost;
    int[][] hint;
    int totalHint;
    int totalStage;
    public int solution(int[][] cost, int[][] hint) {
        this.cost = cost;
        this.hint = hint;
        this.totalHint = hint.length;
        this.totalStage = cost.length;
        this.stages = new int[cost.length + 1];
        solve(0, 0);
        return answer;
    }
    // 힌트 개수 총 합 해서 할 필요 없이 depth 마다 stage cost 계산하는게 더 좋은 코드 같다...
    void solve(int depth, int cnt) {
        if(depth == totalHint){
            count(cnt);
            return;
        }
        for (int i = 1; i < hint[depth].length; i++) {
            int stage = hint[depth][i];
            stages[stage]++;
        }
        solve(depth + 1, cnt + hint[depth][0]);
        for (int i = 1; i < hint[depth].length; i++) {
            int stage = hint[depth][i];
            stages[stage]--;
        }
        solve(depth + 1, cnt);
    }
    void count(int cnt){
        for (int i = 0; i < totalStage; i++){
            int hintCnt = stages[i + 1];
            if (hintCnt >= totalStage)
                cnt += cost[i][totalStage - 1];
            else
                cnt += cost[i][hintCnt];
            if(cnt > answer)
                return;
        }
        answer = cnt;
    }
}