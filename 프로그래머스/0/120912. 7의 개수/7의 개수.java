class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int n = 0; n < array.length; n++) {
            int num = array[n];
            while (num > 0) {
                if (num % 10 == 7) {
                    answer++;
                }
                num /= 10;
            }
        }
        return answer;
    }
}