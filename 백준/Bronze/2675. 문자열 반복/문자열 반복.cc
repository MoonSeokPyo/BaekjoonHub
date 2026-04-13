#include <iostream>
using namespace std;

int main(){
    int t;
    cin >> t;

    int r[t];
    string s[t];
    for (int i = 0; i < t; i++)
    {
        cin >> r[i] >> s[i];
    }

    for (int i = 0; i < t; i++)
    {
        for (int j = 0; j < s[i].length(); j++)
        {
            for (int k = 0; k < r[i]; k++)
            {
                cout << s[i][j];
            }
            
        }
        cout << "\n";
    }
    
    
    return 0;
}