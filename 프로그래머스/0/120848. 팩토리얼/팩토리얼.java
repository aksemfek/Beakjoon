class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum= 1;
        int i = 1;
        while(sum <= n){
            sum = sum * i;
            i++;
            answer++;
        }
        return answer - 1;
    }
}