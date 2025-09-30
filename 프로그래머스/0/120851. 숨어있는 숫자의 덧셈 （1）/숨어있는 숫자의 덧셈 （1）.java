class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){ 
           if("1234567890".indexOf(my_string.charAt(i)) != -1){
               answer += my_string.charAt(i) - '0';
           }
        }
        return answer;
    }
}