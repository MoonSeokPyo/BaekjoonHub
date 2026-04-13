#include <iostream>
using namespace std;

int main(){
    int n, m;
    cin >> n >> m;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        arr[i] = i + 1;
    }

    int x, y, tmp;
    for (int i = 0; i < m; i++)
    {
        cin >> x >> y;
        tmp = arr[x - 1];
        arr[x - 1] = arr[y - 1];
        arr[y - 1] = tmp;
    }

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " " ;
    }
    
    
    
    return 0;
}