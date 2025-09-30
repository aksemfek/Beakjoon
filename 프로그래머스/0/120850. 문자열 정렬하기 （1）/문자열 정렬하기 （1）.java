import java.util.*;  

class Solution {
    public int[] solution(String my_string) {
        String pu = "";
        
        for(int i = 0; i < my_string.length(); i++){
            if("1234567890".indexOf(my_string.charAt(i)) != -1){
                pu += my_string.charAt(i);
            }
        }
        
        int[] answer = new int[pu.length()];
        for(int i = 0; i < pu.length(); i++){
            answer[i] = pu.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        return answer;
    }
}