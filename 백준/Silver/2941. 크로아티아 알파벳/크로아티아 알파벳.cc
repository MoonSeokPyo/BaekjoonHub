#include <iostream>
using namespace std;

bool find(string str, string alphabet, int index, int deep);

int main(){
    string str;
    string arr[8] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    int cnt = 0;
    cin >> str;
    for (int i = 0; i < str.length(); i++)
    {
        for (int j = 0; j < 8; j++)
        {
            if(find(str, arr[j], i, 0))
            {
                // cout << arr[j] << "\n";
                i += arr[j].length() - 1;
                break;
            }
        }
                cnt++;
    }
    
    cout << cnt << "\n";

    return 0;
}

bool find(string str, string alphabet, int index, int deep){
    if(str[index] == alphabet[deep])
    {
        if(deep == alphabet.length() - 1)
            return true;
        if(index + 1 == str.length())
            return false;

        return find(str, alphabet, index + 1, deep + 1);
    }
    return false;
}