class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if ("aeiou".indexOf(my_string.charAt(i)) == -1) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}