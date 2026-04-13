class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        int row = arr.length, col = arr[0].length;
        for(int i = 0; i < row; i++){
            for(int j = i; j < col; j++){
                if(arr[i][j] != arr[j][i])
                    return 0;
            }
        }
        return answer;
    }
}