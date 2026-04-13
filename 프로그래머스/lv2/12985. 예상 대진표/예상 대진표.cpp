#include <iostream>

using namespace std;

int solution(int n, int a, int b)
{
    int answer = 0;
    int aNum = a, bNum = b;
    for (int i = 0; i < n - 1; i++){
        if(((aNum % 2 == 0) && (aNum - 1 == bNum)) || ((aNum % 2 == 1) && (aNum + 1 == bNum))){
            answer = i + 1;
        }
        aNum = aNum / 2 + aNum % 2;
        bNum = bNum / 2 + bNum % 2;
    }
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    cout << "Hello Cpp" << endl;

    return answer;
}