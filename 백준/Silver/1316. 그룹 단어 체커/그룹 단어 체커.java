import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int num = scanner.nextInt();
		int count =0;
		
		for (int i = 0; i < num; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean check() {
		boolean[] check = new boolean[26];
		int pre = 0;
		String word = scanner.next();

		for (int i = 0; i < word.length(); i++) {
			int now = word.charAt(i);

			if (pre != now) {
				if(check[now-'a'] == false) {
					check[now-'a'] = true;
					pre = now;
				}else {
					return false;
				}
			}else {
				continue;
			}
		}
		return true;
	}
}
