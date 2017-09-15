import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int maior = 0;
		int posicao = 0;
		for (int i = 1; i <= 100; i++) {
			numero = scanner.nextInt();
			if (numero > maior) {
				maior = numero;
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
	}
}
