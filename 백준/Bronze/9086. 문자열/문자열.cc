#include <iostream>
using namespace std;

int main(){
    int t;
    cin >> t;
    string str[t];
    for (int i = 0; i < t; i++)
    {
        cin >> str[i];
    }
    for (int i = 0; i < t; i++)
    {
        cout << str[i][0] << str[i][str[i].length() - 1] << "\n";
    }
    
    
    return 0;
}