import java.util.*;

class Solution {
    int k; // 상담 유형
    int n; // 멘토 수
    int[][] reqs;
    Map<Integer, Integer> m = new HashMap<>();
    PriorityQueue<Integer>[] q;
    int answer = Integer.MAX_VALUE;
    
    public int solution(int k, int n, int[][] reqs) {
        this.k = k;
        this.n = n;
        this.reqs = reqs;
        this.q = new PriorityQueue[k + 1];
        for (int i = 1; i <= k; i++)
            q[i] = new PriorityQueue<>();
        solve(1, n);
        return answer;
    }
    
    void solve(int depth, int cnt) {
        // if (depth == k && cnt > 0) {
        if (depth == k) {
            m.put(depth, cnt);
            count();
            return;
        }
        for (int i = 1; i <= cnt - (k - depth); i++){
            m.put(depth, i);
            solve(depth + 1, cnt - i);
        }
    }
    
    void count(){
        int cnt = 0;
        for (int i = 1; i <= k; i++){
            q[i].clear();
        }
        
        for (int i = 0; i < reqs.length; i++){
            int c = reqs[i][2];
            int cur = reqs[i][0];
            int end = cur + reqs[i][1];
            if(q[c].size() < m.get(c)){
                q[c].offer(end);
            } else {
                int time = q[c].poll();
                if(time > cur){
                    int subTime = time - cur;
                    cnt += subTime;
                    q[c].offer(end + subTime);
                    // q[c].offer(time + reqs[i][1]);
                } else
                    q[c].add(end);
            }
            // if(Math.max(cnt, answer) == cnt)
            if(cnt > answer)
                return;
        }
        // StringBuilder sb = new StringBuilder();
        // for (int i = 1; i <= k; i++){
        //     sb.append(m.get(i));
        // }
        // answer = Integer.parseInt(sb.toString());
        answer = cnt;
    }
}