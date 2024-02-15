import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int x = scanner.nextInt(); // 바구니에 들어갈 공의 개수
		int[] arr= new int[x]; 
		int temp;
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		int repeat = scanner.nextInt(); // 반복횟수
		
		for (int i=0; i<repeat; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			while(n<m) {
				temp = arr[n-1];
				arr[n-1]=arr[m-1];
				arr[m-1] =temp;
				n++;
				m--;
				
				}
		
		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
}

