class Solution {
    public int solution(int hp) {
        
        int a = hp / 5;
        int hp1 = hp % 5;
        int b = hp1 / 3;
        int hp2 = hp1 % 3;
        int c = hp2 / 1;
        
        
        
        int answer = a+b+c;
        return answer;
    }
}