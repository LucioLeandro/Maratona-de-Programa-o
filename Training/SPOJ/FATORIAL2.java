import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n >= 0 && n <= 12) {
			System.out.println(calculaFatorial(n));
		}
	}

	private static int calculaFatorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		if(n == 1) {
			return 1;
		}
		for(int i = n-1; i >= 1; i--) {
			n *= i;
		}
		return n;
	}
}
