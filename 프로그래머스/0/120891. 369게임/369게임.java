class Solution {
    public int solution(int order) {
        int answer = 0;
        String  str = String.valueOf(order);
        
        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i) - '0';
            if(c != 0 && c%3 ==0){
                answer++;
            }
        }
        return answer;
    }
}