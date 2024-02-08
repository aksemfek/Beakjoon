import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] a= new int[9];
		int max= 0;
		int count=0;
		for (int i=0;i<9;i++) {
			a[i]= scanner.nextInt();
		}

		for (int i=0; i<9; i++) {
			if(max <a[i]) {
				max = a[i];
				}
			}
		for (int j=0; j<9; j++) {
			count++;
			if(max == a[j]) {
				break;
				}
			}
		System.out.println(max);
		System.out.println(count);
	}
}
