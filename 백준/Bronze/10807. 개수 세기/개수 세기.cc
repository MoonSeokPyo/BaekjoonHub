#include <iostream>
using namespace std;

int main(){
    int n, search, cnt = 0;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cin >> search;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == search)
        {
            cnt++;
        }
    }
    cout << cnt << "\n";

    return 0;
}