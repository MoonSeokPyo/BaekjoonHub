#include <iostream>
using namespace std;

int main(){
    short n, m;
    cin >> n >> m;
    short arr[n];
    for (int i = 0; i < n; i++)
    {
        arr[i] = i + 1;
    }
    int x, y, tmp;
    for (int i = 0; i < m; i++)
    {
        cin >> x >> y;
        for (int j = 0; j < (y - x + 1) / 2; j++)
        {
            tmp = arr[x - 1 + j];
            arr[x - 1 + j] = arr[y - 1 - j];
            arr[y  - 1 - j] = tmp;
        }
    }
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    
    
    return 0;
}