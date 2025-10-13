class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] sol = new int[board.length][board.length];
        
         for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int x = i - 1; x <= i + 1; x++) {
                            for (int y = j - 1; y <= j + 1; y++) {
                            if(x >= 0 && x < board.length && y >=0 && y < board.length){
                                sol[x][y] = 1;
                            }
                        }
                    }
                }
            }
         }
        
        for(int i = 0; i < sol.length; i++){
            for(int j = 0; j <sol.length; j++){
                if(sol[i][j] == 0) answer++;
            }
        }
              
        return answer;
    }
}