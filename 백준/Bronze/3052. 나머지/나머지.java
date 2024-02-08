import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr= new int[10]; 
		int count= 0;
		boolean bl;
		
		for (int i =0; i< arr.length; i++) {
			int x = scanner.nextInt();
			
			arr[i] = x%42;
		}
		
		for(int i =0; i<arr.length; i++) {
			bl = false;
			for(int j=i+1; j<arr.length; j++)	
				if(arr[i] == arr[j]) {
					bl = true;
					break;
				}
			if(bl == false) count++;
		}
		System.out.println(count);
	}
}

