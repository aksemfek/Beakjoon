import java.util.Scanner;
public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		int A = scanner.nextInt();
	    int B = scanner.nextInt();
	    int C = scanner.nextInt();
	    
	    A += C/60;
	    B += C%60;
	      
	    if(B>=60) {
	        A++;
	        B-=60;
	      }
	    if(A>=24) {
	       A-=24;
	    }
	    System.out.println(A + " " +B);
	     
	}
}
