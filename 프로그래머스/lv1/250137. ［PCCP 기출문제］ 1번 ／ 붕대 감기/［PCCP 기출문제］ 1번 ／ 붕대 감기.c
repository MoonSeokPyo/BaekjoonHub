#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// bandage_len은 배열 bandage의 길이입니다.
// attacks_rows는 2차원 배열 attacks의 행 길이, attacks_cols는 2차원 배열 attacks의 열 길이입니다.
int solution(int bandage[], size_t bandage_len, int health, int** attacks, size_t attacks_rows, size_t attacks_cols) {
    int answer = health;
    int count = 0;
    int attack_time = 0;
    for (int i = 0; i < attacks[attacks_rows - 1][0]; i++){
        if (i + 1 == attacks[attack_time][0]){
            answer -= attacks[attack_time][1];
            if (answer <= 0)
                break;
            count = 0;
            if(attack_time + 1 < attacks_rows)
                attack_time++;
            continue;
        }
        answer += bandage[1];
        count++;
        if(count == bandage[0]){
            answer += bandage[2];
            count = 0;
        }
        if(answer > health)
            answer = health;
    }
    if (answer <= 0)
        answer = -1;
    return answer;
}