import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] matrix = new int[n][m]; 
		for(int i=0; i<2;i++) {
			for(int j=0; j<n;j++) {
				for(int k=0; k<m;k++) {
					matrix[j][k] += scanner.nextInt();
				}
			}
		}
		for(int j=0; j<n;j++) {
			for(int k=0; k<m;k++) {
				System.out.print(matrix[j][k] + " "); 
			}
			System.out.println();
		}
	}
}
