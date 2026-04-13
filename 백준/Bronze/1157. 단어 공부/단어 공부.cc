#include <iostream>
#include <cstring>
using namespace std;

int main(){
    string str;
    char output;
    int max = -1, index, arr['Z' - 'A' + 1]; // A == 65
    memset(arr, 0, sizeof(arr));

    cin >> str;
    for (int i = 0; i < str.length(); i++)
    {
        if(str[i] >= 'a' && str[i] <= 'z')
        {
            str[i] = toupper(str[i]);
        }
        arr[str[i] - 'A']++;
    }
    for (int i = 0; i < 'Z' - 'A' + 1; i++)
    {
        if(max < arr[i])
        {
            max = arr[i];
            index = i;
        } else if (max == arr[i]){
            index = -1;
        }
    }
    if(index == -1)
        cout << '?' << "\n";
    else
    {
        output = 65 + index;
        cout << output << "\n";
    }
    
    return 0;
}