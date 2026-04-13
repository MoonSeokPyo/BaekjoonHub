#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    int arr[n], max = -1;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
        if (arr[i] > max)
            max = arr[i];
    }

    float score[n], avg = 0;
    for (int i = 0; i < n; i++)
    {
        score[i] = arr[i] / (float)max * 100;
        avg += score[i];
    }
    avg = avg / n;
    cout << avg << endl;
    
    return 0;
}