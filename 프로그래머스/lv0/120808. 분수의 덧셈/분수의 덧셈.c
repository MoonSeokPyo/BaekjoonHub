#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
// 분자1, 분모1, 분자2, 분모2
int* solution(int numer1, int denom1, int numer2, int denom2) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* answer = (int*)malloc(2 * sizeof(int));
    int numer, denom;
    denom = denom1 * denom2;
    numer = (numer1 * denom2) + (numer2 * denom1);

    for (int i = 2; i <= denom; i++) {
        // if ((i <= denom) && (denom % i == 0)) {
        if ((i <= denom) && (denom % i == 0) && (numer % i == 0)) {
            denom = denom / i;
            numer = numer / i;
            i--;
        }
    }

    answer[0] = numer;
    answer[1] = denom;
    
    
//     if(denom1 > numer1){
//         if(denom1 % numer1 == 0){
//             numer1 = numer1 / numer1;
//             denom1 = denom1 / numer1;
//         }
//     }
//     else{
//         if(numer1 % denom1 == 0){
//             numer1 = numer1 / denom1;
//             denom1 = denom1 / denom1;
//         }
//     }
    
//     if(denom2 > numer2){
//         if(denom2 % numer2 == 0){
//             numer2 = numer2 / numer2;
//             denom2 = denom2 / numer2;
//         }
//     }
//     else{
//         if(numer2 % denom2 == 0){
//             numer2 = numer2 / denom2;
//             denom2 = denom2 / denom2;
//         }
//     }
//         ////////////////////////////////////////
//     if(denom1 < denom2){
//         if(denom2 % denom1 == 0){
//             answer[0] = (numer1 * (denom2/denom1)) + numer2;
//             answer[1] = denom2;
//         }
//         else{
//             answer[0] = (numer1 * denom2) + (numer2 * denom1);
//             answer[1] = denom1 * denom2;
//         }
//     }
//     else{
//         if(denom1 % denom2 == 0){
//             answer[0] = (numer2 * (denom1/denom2)) + numer1;
//             answer[1] = denom1;
//         }
//         else{
//             answer[0] = (numer1 * denom2) + (numer2 * denom1);
//             answer[1] = denom1 * denom2;
//         }
//     }
//         ////////////////////////////////
//     if(answer[1] > answer[0]){
//         if(answer[1] % answer[0] == 0){
//             answer[0] = answer[0] / answer[0];
//             answer[1] = answer[1] / answer[0];
//         }
//     }
//     else{
//         if(answer[0] % answer[1] == 0){
//             answer[0] = answer[0] / answer[1];
//             answer[1] = answer[1] / answer[1];
//         }
//     }
    return answer;
}
