class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" ");
        int xsum = 0;
        int numsum = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("+")) continue;
            
            if (str[i].contains("x")) {
                if (str[i].equals("x")) xsum += 1;
                else xsum += Integer.parseInt(str[i].replace("x", ""));
            } else {
                numsum += Integer.parseInt(str[i]);
            }
        }

        if (xsum != 0 && numsum != 0) {
            if (xsum == 1) answer = "x + " + numsum;
            else answer = xsum + "x + " + numsum;
        } else if (xsum != 0) {
            if (xsum == 1) answer = "x";
            else answer = xsum + "x";
        } else {
            answer = String.valueOf(numsum);
        }

        return answer;
    }
}
