// import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(long n) {
        // String str = String.valueOf(n);
        // int[] answer = new int[size];
        
        // for (int i = 0; i < str.length(); i++){
        //     answer[i] = Integer.parseInt(str[str.length() - (i + 1)]);
        // }
        
        
        
        // long temp1 = n, temp2;
        // while(temp1 >= 1){
        //     temp2 = temp1;
        //     temp1 = temp / 10;
        //     answer = temp2 % 10;
        // }
        
        // int num;
        // for(int i = 0; i < size; i++){
        //     num = (int)(n % 10L);
        //     n /= 10;
        //     answer[size - i] = num;
        // }
        
        List<Integer> numbers = new ArrayList<>();
        while(n > 0){
            numbers.add((int)(n % 10L));
            n /= 10;
        }
        // int[] answer = new int[numbers.size()];
        // for(int i = 0; i < numbers.size(); i++){
        //     answer[i] = numbers.get(i);
        // }
//         int[] result = new int[numbers.size()];
//         for(){
            
//         }
        return numbers;
    }
}