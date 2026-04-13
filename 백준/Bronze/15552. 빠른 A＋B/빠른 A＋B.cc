#include <iostream>
using namespace std;

int main(){
    int t;
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    cin >> t;

    short *a = new short[t], *b = new short[t], *sum = new short[t];

    for (int i = 0; i < t; i++)
    {
        cin >> a[i] >> b[i];
        sum[i] = a[i] + b[i];
    }
    
    for (int i = 0; i < t; i++)
    {
        cout << sum[i] << "\n";
    }
    

    delete []a;
    delete []b;
    delete []sum;
    return 0;
}