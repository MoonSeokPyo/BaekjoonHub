#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

void found(int** land, int** array, int i, int j, size_t land_rows, size_t land_cols);
// land_rows는 2차원 배열 land의 행 길이, land_cols는 2차원 배열 land의 열 길이입니다.
int solution(int** land, size_t land_rows, size_t land_cols) {
    int answer = 0;
    int num;
    int** array = (int**)malloc(sizeof(int*) * land_rows);
    for (int i = 0; i < land_rows; i++) {
        array[i] = (int*)calloc(land_cols, sizeof(int));
    }
    
    for (int i = 0; i < land_cols; i ++){
        //int array[sizeof(land)/sizeof(land[0])][sizeof(land[0])/sizeof(int)] = {0,};
        for (int j = 0; j < land_rows; j++){
            for (int k = 0; k < land_cols; k++){
                array[j][k] = 0;
            }
        }
        
        for (int j = 0; j < land_rows; j++){
            if((land[j][i] == 1) && array[j][i] == 0){
                array[j][i] = 1;
                found(land, array, i, j, land_rows, land_cols);
            }
        }
        num = 0;
        for (int j = 0; j < land_rows; j++){
            for (int k = 0; k < land_cols; k++){
                if(array[j][k] == 1)
                    num++;
            }
        }
        if(num > answer)
            answer = num;
    }
    
    for (int i = 0; i < land_rows; i++) {
        free(array[i]);
    }
    free(array);
    
    return answer;
}
void found(int** land, int** array, int i, int j, size_t land_rows, size_t land_cols){
    if((j - 1 >= 0) && (land[j - 1][i] == 1) && (array[j - 1][i] == 0)){
        array[j - 1][i] = 1;
        found(land, array, i, j - 1, land_rows, land_cols);
    }
    if((i - 1 >= 0) && (land[j][i - 1] == 1) && (array[j][i - 1] == 0)){
        array[j][i - 1] = 1;
        found(land, array, i - 1, j, land_rows, land_cols);
    }
    //if((j + 1 < (sizeof(land)/sizeof(land[0]))) && (land[j + 1][i] == 1) && (array[j + 1][i] == 0)){
    if((j + 1 < land_rows) && (land[j + 1][i] == 1) && (array[j + 1][i] == 0)){
        array[j + 1][i] = 1;
        found(land, array, i, j + 1, land_rows, land_cols);
    }
    //if((i + 1 < (sizeof(land[0])/sizeof(int))) && (land[j][i + 1] == 1) && (array[j][i + 1] == 0)){
    if((i + 1 < land_cols) && (land[j][i + 1] == 1) && (array[j][i + 1] == 0)){
        array[j][i + 1] = 1;
        found(land, array, i + 1, j, land_rows, land_cols);
    }
}