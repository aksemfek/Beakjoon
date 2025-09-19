class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] so = myString.toCharArray();
        
        for(int i = 0; i < so.length; i++){
            if(so[i] < 'l'){
                so[i] = 'l';
            }
            answer +=so[i];
        }
    
        
        return answer;
    }
}