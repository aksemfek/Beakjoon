import java.util.Scanner;
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 int x = scanner.nextInt();
		 int n = scanner.nextInt();
		 
		 int result = 0;
		 
		 for (int i=1; i<=n; i++) {
			 
			 int a = scanner.nextInt();
			 int b = scanner.nextInt();
			 
			 int c = a*b;
			 result += c;
		 
			 			
		 }		 
		 if (x==result) {
			 System.out.println("Yes");
		 }
		 else System.out.println("No");
		

 
	}     
}

