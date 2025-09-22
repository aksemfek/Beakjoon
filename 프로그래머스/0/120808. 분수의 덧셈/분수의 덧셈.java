class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;
        
        int g = gcd(numerator, denominator);

        answer[0] = numerator / g;
        answer[1] = denominator / g;
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}