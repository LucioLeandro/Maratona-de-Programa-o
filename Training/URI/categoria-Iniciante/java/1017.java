import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int tempo = scanner.nextInt();
		int velocidade = scanner.nextInt();

		double distancia = tempo * velocidade;


		System.out.printf("%.3f\n", distancia/12);


	}
}
