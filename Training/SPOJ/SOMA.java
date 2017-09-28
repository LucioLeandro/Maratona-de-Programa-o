import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeros = scanner.nextInt();
		System.out.println(processa(scanner, numeros));
	}

	/**
	 * @param scanner
	 * @param numeros
	 */
	public static int processa(Scanner scanner, int numeros) {
		int numeroFinal = 0;
		for(int i = 1; i <= numeros; i++) {
			numeroFinal += scanner.nextInt();
		}
		return numeroFinal;
	}
}
