#include <iostream>
using namespace std;

int main(){
    short a, b;
    while(1)
    {
        cin >> a >> b;
        if(cin.eof()) return 0;
        cout << a + b << "\n";
    }
    return 0;
}