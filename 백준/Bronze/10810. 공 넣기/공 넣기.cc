#include <iostream>
using namespace std;

int main(){
    int n, m;
    int x, y, num;
    cin >> n >> m;
    int arr[n] = {0};
    
    for (int i = 0; i < m; i++)
    {
        cin >> x >> y >> num;
        for (int j = x - 1; j < y; j++)
        {
            arr[j] = num;
        }
        
    }
    

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    

    return 0;
}