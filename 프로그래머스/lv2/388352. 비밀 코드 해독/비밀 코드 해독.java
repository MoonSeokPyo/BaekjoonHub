class Solution {
    boolean[] visited;
    int answer = 0;
    int[][] q;
    int qLength;
    int[] ans;
    int n;
    // int cnt = 0;
    public int solution(int n, int[][] q, int[] ans) {
        this.visited = new boolean[n + 1];
        this.q = q;
        this.qLength = q.length;
        this.ans = ans;
        this.n = n;
        // dfs(0, 0, 0);
        dfs(0, 1);
        return answer;
    }
    void dfs (int cnt, int startIdx){
        for (int i = startIdx; i <= n; i++){
            visited[i] = true;
            if (cnt == 4 && check()){
                answer++;
            } else if (cnt < 5){
                dfs(cnt + 1, i + 1);
            }
            visited[i] = false;
        }
    }
    boolean check(){
        for (int i = 0; i < qLength; i++) {
            int qCnt = 0;
            for (int j = 0; j < 5; j++) {
                int cur = q[i][j];
                if (visited[cur])
                    qCnt++;
            }
            if(qCnt != ans[i])
                return false;
        }
        return true;
    }
    /*
    void dfs (int startIdx, int depth, int qCnt){
        if (qCnt == ans[depth]){
            if(cnt == 5 && depth == 4)
                        answer++;
            else if (depth < 4){
                int aCnt = 0;
                for (int j = 0; j < 5; j++){
                int next = q[depth + 1][j];
                    if (visited[next])
                        aCnt++;
                }
                dfs(0, depth + 1, aCnt);
            }
        }
        for (int i = startIdx; i < 5; i++){
            int cur = q[depth][i];
            if (!visited[cur]){
                visited[cur] = true;
                cnt++;
                qCnt++;
                if (qCnt == ans[depth]){
                    if(cnt == 5 && depth == 4)
                        answer++;
                    else if (depth < 4){
                        int aCnt = 0;
                        for (int j = 0; j < 5; j++){
                            int next = q[depth + 1][j];
                            if (visited[next])
                                aCnt++;
                        }
                        dfs(0, depth + 1, aCnt);
                    }
                } else {
                    dfs(i + 1, depth, qCnt);
                }
                visited[cur] = false;
                cnt--;
                qCnt--;
            }
        }
    }
    */
}