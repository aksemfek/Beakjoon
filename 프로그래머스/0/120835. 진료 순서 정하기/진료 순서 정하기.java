import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emer = emergency.clone();
        Arrays.sort(emer);
                    
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emer.length; j++) {
                if (emergency[i] == emer[j]) {
                    answer[i] = emer.length - j;
                    break;
                }
            }
        }
        return answer;
    }
}