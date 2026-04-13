  #include <iostream>
  using namespace std;
  
  int main(){
    int arr[9], max, n;
    for (int i = 0; i < 9; i++)
    {
        cin >> arr[i];
    }
    max = arr[0];
    n = 0;
    for (int i = 0; i < 9; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
            n = i;
        }
        
    }
    cout << max << "\n" << n + 1 << endl;
    
    return 0;
  }