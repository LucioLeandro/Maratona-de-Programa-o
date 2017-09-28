import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int limite = scanner.nextInt();
		int nOne = scanner.nextInt();
		String sinal = scanner.next();
		int nTwo = scanner.nextInt();

		if (!processa(limite, sinal, nOne, nTwo)) {
			System.out.println("OK");
		} else {
			System.out.println("OVERFLOW");
		}
	}

	private static boolean processa(int limite, String sinal, int nOne, int nTwo) {
		if (sinal.equals("+")) {
			return nOne + nTwo > limite;
		} else if (sinal.equals("*")) {
			return nOne * nTwo > limite;
		}
		return  false;	
	}
}
