#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<string>> board, int h, int w) {
    int answer = 0;
    if ((h - 1 >= 0) && (board[h][w] == board[h-1][w]))
        answer++;
    if ((w - 1 >= 0) && (board[h][w] == board[h][w - 1]))
        answer++;
    if ((h + 1 < board.size()) && (board[h][w] == board[h + 1][w]))
        answer++;
    if ((w + 1 < board[0].size()) && (board[h][w] == board[h][w + 1]))
        answer++;
    return answer;
}