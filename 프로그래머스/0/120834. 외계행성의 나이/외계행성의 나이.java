class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        
        for(int i = 0; i < str.length(); i++){
            int digit = str.charAt(i) - '0'; 
            char letter = (char) ('a' + digit);
            answer += letter;
        }
        return answer;
    }
}