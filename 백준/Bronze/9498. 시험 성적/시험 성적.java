import java.util.Scanner;
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int A = scanner.nextInt();
		
		if (A >= 90) {
			System.out.println("A");
		}
		else if(A >=80) {
			System.out.println("B");
		}
		else if(A >=70) {
			System.out.println("C");
		}
		else if(A >=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
