class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <=n; i++){
            if(isComposite(i)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isComposite(int k){
        if(k <=1) return false;
        
        int count = 0;
        for(int i = 1;  i <= k; i++){
            if(k % i == 0) count++;
        }
        return count > 2;
    }
}