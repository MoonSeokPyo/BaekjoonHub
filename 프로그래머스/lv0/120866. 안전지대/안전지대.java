class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        boolean[][] matrix = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    for(int x = i - 1; x < i + 2; x++){
                        for(int y = j - 1; y < j + 2; y++){
                            if(x > -1 && y > -1 && x < board.length && y < board[0].length){
                                matrix[x][y] = true;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(matrix[i][j] == false){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}