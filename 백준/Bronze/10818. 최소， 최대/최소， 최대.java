import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int x = scanner.nextInt();
		int[] a= new int[x];
		int max= -1000001, min= 10000001;
		for (int i=0;i<x;i++) {
			a[i]= scanner.nextInt();
		}

		for (int i=0; i<x; i++) {
			if(max <a[i]) {
				max = a[i];
			}
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.print(min+ " "+max);
	}
}

