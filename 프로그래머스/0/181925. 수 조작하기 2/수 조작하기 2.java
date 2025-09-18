class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 1; i < numLog.length; i++){
            int cor = numLog[i] - numLog[i-1];
            if(cor == 1){
                answer += "w";
            }
            if(cor == 10){
                answer += "d";
            }
            if(cor == -1){
                answer += "s";
            }
            if(cor == -10){
                answer += "a";
            }
        }
        return answer;
    }
}