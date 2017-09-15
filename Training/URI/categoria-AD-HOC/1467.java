import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		while(scanner.hasNextInt()) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			System.out.println(processa(a, b,c ));
		}
	}


	private static boolean isValid(int a, int b, int c) {
		return a <= 1 && a >= 0 && b <= 1 && b >= 0 && c <= 1 && c >= 0 ;
	}

	private static String processa(int a, int b, int c) {

		if(isValid(a,b,c)) {

			if(a != b && a != c) {
				return "A";
			} else if(b != a && b != c) {
				return "B";
			} else if(c != b && c != a) {
				return "C";
			}
		}

		return "*";
	}
}
