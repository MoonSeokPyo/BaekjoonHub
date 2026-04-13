class Solution {
    public int solution(String s) {
//         int answer = 0;
//         String temp = s;
//         temp = temp.replace("zero", "0");
//         temp = temp.replace("one", "1");
//         temp = temp.replace("two", "2");
//         temp = temp.replace("three", "3");
//         temp = temp.replace("four", "4");
//         temp = temp.replace("five", "5");
//         temp = temp.replace("six", "6");
//         temp = temp.replace("seven", "7");
//         temp = temp.replace("eight", "8");
//         temp = temp.replace("nine", "9");
        
//         answer = Integer.valueOf(temp).intValue();
        
        // return answer;
        
        
        
        
        // 1. zero ~ nine 반복을 한다.
        // 2. s에 있는지 판단
        // 3. 있으면 숫자로 바꿈
        // 4. 없으면 그냥 넘어감
        // 5. 바꾼 문자열을 return
        
        
        // 4 > "4" : String.valueOf(4);
        // "4" > 4 : Integer.parseInt("4");
        
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}