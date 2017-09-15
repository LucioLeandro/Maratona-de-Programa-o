import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int distancia = scanner.nextInt();
		double litros = scanner.nextDouble();

		System.out.printf("%.3f km/l\n", distancia/litros);


	}
}
