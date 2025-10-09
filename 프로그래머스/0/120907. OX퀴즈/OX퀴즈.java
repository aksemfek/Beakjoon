class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] str = quiz[i].split(" ");
            
            int first = Integer.parseInt(str[0]);
            String op = str[1];
            int second = Integer.parseInt(str[2]);
            int result = Integer.parseInt(str[4]);
            
            if(op.equals("+")){
                answer[i] = first + second == result ? "O" : "X"; 
            } else{
                answer[i] = first - second == result ? "O" : "X"; 
            }
            
        }
        
        return answer;
    }
}