import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		double salario = scanner.nextDouble();
		double vendas = scanner.nextDouble();

		double total = (vendas * 0.15) + salario;

		System.out.printf("TOTAL = R$ %.2f\n", total);

	}
}
