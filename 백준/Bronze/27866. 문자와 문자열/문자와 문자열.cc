#include <iostream>
using namespace std;

int main(){
    string str;
    getline(cin, str);
    int i;
    cin >> i;
    cout << str[i - 1];
    return 0;
}