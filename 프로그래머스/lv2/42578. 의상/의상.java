import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        int num = clothes.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                map.replace(clothes[i][1], map.get(clothes[i][1]) + 1);
            }else{
                map.putIfAbsent(clothes[i][1], 2);
            }
        }
        
        for(String key : map.keySet()){
            answer *= map.get(key);
        }
        return answer - 1;
    }
}