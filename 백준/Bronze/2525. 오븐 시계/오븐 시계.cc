#include <iostream>
using namespace std;

int main(){
    int a, b, c;
    cin >> a >> b >> c;

    b = b + (c % 60);
    if (b >= 60)
    {
        a++;
        b = b - 60;
    }

    a = a + (c / 60);
    while (a >= 24)
    {
        a = a - 24;
    }
    
    cout << a << " " << b << endl;
    
    return 0;
}