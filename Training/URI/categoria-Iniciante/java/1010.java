import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cod1 = scanner.nextInt();
		int qtd1 = scanner.nextInt();
		double preco1 = scanner.nextDouble();
		int cod2 = scanner.nextInt();
		int qtd2 = scanner.nextInt();
		double preco2 = scanner.nextDouble();

		double valor = qtd1 * preco1 + qtd2 * preco2;

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);


	}
}
