#include <iostream>
using namespace std;

int main(){
    short n, x;
    cin >> n >> x;
    short arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < x)
        {
            cout << arr[i] << " ";
        }
        
    }
    
    
    return 0;
}