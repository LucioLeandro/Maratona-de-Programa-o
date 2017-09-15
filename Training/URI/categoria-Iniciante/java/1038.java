import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cod = scanner.nextInt();
		int qtd = scanner.nextInt();

		if(cod == 1) {
			System.out.printf("Total: R$ %.2f\n", qtd * 4.00);
		} else if(cod == 2) {
			System.out.printf("Total: R$ %.2f\n", qtd * 4.50);
		} else if(cod == 3) {
			System.out.printf("Total: R$ %.2f\n", qtd * 5.00);
		} else if(cod == 4) {
			System.out.printf("Total: R$ %.2f\n", qtd * 2.00);
		} else if(cod == 5) {
			System.out.printf("Total: R$ %.2f\n", qtd * 1.50);
		}
	}
}
