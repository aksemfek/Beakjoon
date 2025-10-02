import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            for(int j =0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count ++;
                }
            }
            if(count == 1){
                answer += s.charAt(i);
            }
        }
        
        char[] c = answer.toCharArray();
        
        Arrays.sort(c);
        
        answer = "";
        
        for(int i = 0; i < c.length; i++){
            answer += c[i] + "";
        }
        Arrays.sort(c);
        
        return answer;
    }
}