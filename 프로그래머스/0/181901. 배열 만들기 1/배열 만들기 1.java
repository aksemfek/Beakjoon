class Solution {
    public int[] solution(int n, int k) {
        int size = n/k;
        int[] answer = new int[size];
        int s = 0;
        for(int i = k; i<=n; i+=k){
            answer[s] = i;
            s++;
            }
        return answer;
    }
}