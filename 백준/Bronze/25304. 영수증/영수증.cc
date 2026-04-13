#include <iostream>
using namespace std;

int main(){
    int x, n, sum = 0;
    int a, b;
    cin >> x >> n;

    for (int i = 0; i < n; i++)
    {
        cin >> a >> b;
        sum += a * b;
    }
    if(x == sum)
    {
        cout << "Yes" << endl;
    } else
    {
        cout << "No" << endl;
    }
    
    return 0;
}