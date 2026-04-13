#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<vector<int>> data, string ext, int val_ext, string sort_by) {
    vector<vector<int>> answer;
    vector<vector<int>>::iterator it;
    int num, sort_num, insert = 0, answer_size;
    if(ext == "code")
        num = 0;
    else if(ext == "date")
        num = 1;
    else if(ext == "maximum")
        num = 2;
    else if(ext == "remain")
        num = 3;
    
    if(sort_by == "code")
        sort_num = 0;
    else if(sort_by == "date")
        sort_num = 1;
    else if(sort_by == "maximum")
        sort_num = 2;
    else if(sort_by == "remain")
        sort_num = 3;
    /*
    switch (ext){
        case "code":
            num = 0;
            break;
        case "date":
            num = 1;
            break;
        case "maximum":
            num = 2;
            break;
        case "remain":
            num = 3;
            break;
    }
    switch (sort_by){
        case "code":
            sort_num = 0;
            break;
        case "date":
            sort_num = 1;
            break;
        case "maximum":
            sort_num = 2;
            break;
        case "remain":
            sort_num = 3;
            break;
    }
    switch에서 string 안됨 하려면 const_hash 이용해야 함
    */
    for (int i = 0; i < data.size(); i++){
        answer_size = answer.size();
        if(data[i][num] >= val_ext)
            continue;
        for(int j = 0; j < answer_size; j++){
            if(/*(j + 1 < answer_size) && (answer[j][sort_num] <= data[i][sort_num]) &&*/ (answer[j][sort_num] > data[i][sort_num])){
                /*insert = j + 1;
                for(int k = 0; k < data[0].size(); j++){
                    answer[j + 2][k] = answer[j][k];
                }*/
                it = answer.begin() + j;
                answer.insert(it ,data[i]);
                break;
            } else if(j + 1 == answer_size)
               answer.push_back(data[i]);
        }
        if(answer_size == 0)
            answer.push_back(data[i]);
    }
    return answer;
}