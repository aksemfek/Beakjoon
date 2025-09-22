class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int co = 0; 
        if(n/10 != 0){
            co = n/10;
            k -= co;
        }
        answer = n*12000 + k *2000;
        return answer;
    }
}