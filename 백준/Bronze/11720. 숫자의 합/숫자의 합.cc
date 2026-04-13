#include <iostream>
using namespace std;

int main(){
    int n, sum = 0;
    cin >> n;
    string str;
    cin >> str;
    for (int i = 0; i < n; i++)
    {
        sum += str[i] - 48;
    }
    cout << sum << endl;
    
    return 0;
}