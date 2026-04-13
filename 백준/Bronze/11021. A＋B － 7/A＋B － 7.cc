#include <iostream>
using namespace std;

int main(){
    int t;
    cin >> t;
    short *a = new short[t], *b = new short[t], *sum = new short[t];
    for (int i = 0; i < t; i++)
    {
        cin >> a[i] >> b[i];
        sum[i] = a[i] + b[i];
    }

    for (int i = 0; i < t; i++)
    {
        cout << "Case #" << i + 1 << ": " << sum[i] << "\n";
    }
    

    delete []a;
    delete []b;
    return 0;
}