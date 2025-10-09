class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        
        for(int i = 0; i <= str1.length() - str2.length(); i++){
            String str = "";
            for(int j = i; j < i + str2.length(); j++){
                str += str1.charAt(j);
            }
            
            if(str2.equals(str)){
                answer = 1;
            }
            
        }
        
        return answer;
    }
}