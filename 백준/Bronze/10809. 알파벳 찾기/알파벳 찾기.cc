#include <iostream>
#include <cstring>
using namespace std;

int main(){
    string s;
    int arr['z' - 'a' + 1];
    memset(arr, -1, sizeof(arr));
    cin >> s;
    for (int i = 0; i < s.length(); i++)
    {
        if (arr[s[i] - 'a'] == -1)
        {
            arr[s[i] - 'a'] = i;
        }
        
    }

    for (int i = 0; i < 'z' - 'a' + 1; i++)
    {
        cout << arr[i] << " ";
    }
    

    return 0;
}