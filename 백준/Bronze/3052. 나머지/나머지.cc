#include <iostream>
using namespace std;

int main(){
    int n, cnt = 0;
    bool arr[42] = {false};
    for (int i = 0; i < 10; i++)
    {
        cin >> n;
        arr[n % 42] = true;
    }
    for (int i = 0; i < 42; i++)
    {
        if (arr[i] == true)
        {
            cnt++;
        }
    }
    cout << cnt;    
    
    return 0;
}