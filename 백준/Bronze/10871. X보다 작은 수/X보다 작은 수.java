import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int[] a= new int[x];
		
		for (int i=0;i<x;i++) {
			a[i]= scanner.nextInt();
		}

		for (int i=0; i<x; i++) {
			if(a[i] <y) {
				System.out.print(a[i]+ " ");
			}	
		}
		
	}
}

