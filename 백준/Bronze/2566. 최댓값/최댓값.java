import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix = new int[9][9];
		int max = -1;
		int a=0;
		int b=0;
		
		for(int i =0; i<matrix.length;i++) {
			for(int j = 0; j<matrix[i].length;j++) {
				matrix[i][j] = scanner.nextInt();
				if(max<matrix[i][j]) {
					max = matrix[i][j];
					a=i+1;
					b=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(a + " " + b);
		
	}
}
