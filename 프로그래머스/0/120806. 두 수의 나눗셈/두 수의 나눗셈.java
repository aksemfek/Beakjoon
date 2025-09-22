class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double an = num1 / (double)num2 *1000;
        answer = (int)an;
        return answer;
    }
}