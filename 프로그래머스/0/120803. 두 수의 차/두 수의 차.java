import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int answer = solution(num1, num2);
        System.out.println(answer);
    }

    static int solution(int num1, int num2){
        int answer =0;
        answer = num1 - num2;
        return answer;
    }
}