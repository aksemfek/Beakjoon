import java.util.Scanner;
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int h = scanner.nextInt();
	      int m = scanner.nextInt();
	      
	      if (m<45) {
	         if(h==0) {
	            h=24;
	         }
	         System.out.println((h-1) +" " + (m+15));

	      }
	         else {
	            System.out.println(h + " " + (m-45));
	         }
	}
}
