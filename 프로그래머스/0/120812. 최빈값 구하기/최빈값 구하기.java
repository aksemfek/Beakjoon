class Solution {
    public int solution(int[] array) {
        int answer = -1;       
        int an = 0;       
        int count = 0;         
        int[] ar = new int[1000]; 

        for (int i = 0; i < array.length; i++) {
            ar[array[i]]++;
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > an) {
                an = ar[i];  
                answer = i;       
                count = 1;        
            } else if (ar[i] == an && ar[i] != 0) {
                count++;         
            }
        }

        if (count > 1) return -1;
        return answer;
    }
}