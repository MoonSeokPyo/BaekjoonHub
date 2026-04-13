class Solution {
    public long solution(int a, int b) {
        // if (a < b)
        //     return func(a, b);
        // else
        //     return func(b, a);
        return a < b ? func(a, b) : func(b, a);
    }
    public long func(int a, int b){
        long answer = 0;
        for(int i = a; i <= b; i++){
            answer += i;
        }
        return answer;
    }
}


