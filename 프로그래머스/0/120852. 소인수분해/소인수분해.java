import java.util.*;

class Solution {
    public int[] solution(int n) {
        int su = n;
        Set<Integer> set = new LinkedHashSet<>(); 

        for (int i = 2; i <= su; i++) {
            while (su % i == 0) {
                su /= i;
                set.add(i);
            }
        }

        int[] answer = new int[set.size()];
        int idx = 0;
        for (int val : set) {
            answer[idx++] = val;
        }
        return answer;
    }
}