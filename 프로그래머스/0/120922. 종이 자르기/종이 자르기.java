import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int answer = solution(N, M);
        System.out.println(answer);
    }

    static int solution(int num1, int num2){
        int answer =0;
        answer = num1 * num2 - 1;
        return answer;
    }
}