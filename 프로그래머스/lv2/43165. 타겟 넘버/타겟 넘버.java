class Solution {
    int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        func(numbers, target, 0, 0);
        
        return answer;
    }
    void func(int[] numbers, int target, int index, int count){
        if(index == numbers.length){
            if(count == target){
                answer += 1;
            }
        } else{
            func(numbers, target, index + 1, count + numbers[index]);
            func(numbers, target, index + 1, count - numbers[index]);
            // 아래와 같이 i++로 하면 재귀함수 stack overflow가 발생하는데 왜그런가요?
            // func(numbers, target, index++, count - numbers[index]);
            
            // 아래 방법대로 하면 ++index 때문에 배열 인덱스 넘어가져서 "count + numbers[index]"에서 에러난다.
            // 매개변수 순서를 바꾸던가 위와 같이 사용해야 한다.
            // func(numbers, target, ++index, count + numbers[index]);
            // func(numbers, target, ++index, count - numbers[index]);
        }
    }
}