import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long m;
		long n;
		while(scanner.hasNext()) {
			m = scanner.nextLong();
			n = scanner.nextLong();
			if(inputIsValid(m,n)) {
				System.out.println(fatorial(m) + fatorial(n));
			}
		}
	}

	private static long fatorial(long numero) {
		if(numero == 0 || numero == 1){
			return 1;
		}
		for(int i = (int) (numero - 1); i > 1; i --){
			numero *= i;
		}
		return numero;
	}

	private static boolean inputIsValid(long m, long n) {

		return m >= 0 && m <= 20 && n >= 0 && n <= 20;
	}
}
