class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("left")){
            int first = numbers[0];
            for(int i = 1; i < answer.length; i++){
                answer[i-1] = numbers[i];
            }
            answer[answer.length-1] = first;
        } else{
            int last = numbers[numbers.length -1];
            for(int i = 1;  i < numbers.length; i++){
                answer[i] = numbers[i-1];
            }
            answer[0] = last;
        }
        return answer;
    }
}