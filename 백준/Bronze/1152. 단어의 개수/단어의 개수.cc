#include <iostream>
using namespace std;

int main(){
    string str;
    int cnt = 0;
    bool flag = false;
    getline(cin, str);

    // if(str[0] == ' ')
    //     // str.erase(0);    // 이렇게 하면 모두 지운다.
    //     str.erase(0, 1);
    // if(str[str.length()] == ' ')
    //     str.erase(str.length() - 1,);

    for (int i = 0; i < str.length(); i++)
    {
        if(flag == false && str[i] != ' ')
        {
            flag = true;
            cnt++;
        } else if(flag == true && str[i] == ' '){
            flag = false;
        }


    }
    cout << cnt << "\n";

    return 0;
}