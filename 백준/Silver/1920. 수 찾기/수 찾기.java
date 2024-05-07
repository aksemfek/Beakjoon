import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int M = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {

            if(binarySearch(A, sc.nextInt()) >= 0) {
                sb.append(1).append('\n');
            }
            else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int A[], int key){
        int lo = 0;
        int hi = A.length-1;
        while(lo<=hi){

            int mid = (lo+ hi) / 2;
            if(key < A[mid]){
                hi = mid -1;
            }
            else if(key > A[mid]) {
                lo = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
