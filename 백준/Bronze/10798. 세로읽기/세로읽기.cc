#include <iostream>
using namespace std;

int main(){
    int maxlen = 0;
    string str[5];
    for (int i = 0; i < 5; i++)
    {
        cin >> str[i];
        if (str[i].length() > maxlen)
        {
            maxlen = str[i].length();
        }
    }
    for (int i = 0; i < maxlen; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            if (str[j].length() < i + 1)
            {
                continue;
            }
            cout << str[j][i];
        }
        
    }
    
    return 0;
}