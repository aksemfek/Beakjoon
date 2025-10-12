class Solution {
    public int solution(int[][] dots) {
        int answer = 0; 
        int minx = 256;
        int maxx = -256;
        int miny = 256;
        int maxy = -256;
        
        for (int i = 0; i < dots.length; i++) {
            if (dots[i][0] < minx) minx = dots[i][0];
            if (dots[i][0] > maxx) maxx = dots[i][0];
            if (dots[i][1] < miny) miny = dots[i][1];
            if (dots[i][1] > maxy) maxy = dots[i][1];
        }
        
        answer = (maxx - minx) * (maxy - miny); 
        return answer;
    }
}
