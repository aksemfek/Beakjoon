class Solution {
    public int[] solution(int n) {
        int size = 0;
        
         if (n % 2 == 0) {        
            size = n / 2;
        } else {                 
            size = n / 2 + 1;
        }
        
        int[] answer = new int[size];
        answer[0] = 1;
        for(int i = 1; i < size; i++){
            answer[i] = answer[i-1] + 2;
        }
        return answer;
    }
}