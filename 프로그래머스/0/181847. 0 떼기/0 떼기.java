class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] num = n_str.toCharArray();
        int n = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] != '0'){
                n = i;
                break;
            }
        }
        
        for(int i = n; i < num.length; i++){
            answer += num[i];
        }
        return answer;
    }
}