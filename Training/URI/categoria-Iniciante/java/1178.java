
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] vetor = new double[100];

		double n = scanner.nextDouble();

		for(int i = 0; i < 100; i++) {
			vetor[i] = n;
			n /= 2;
		}

		for(int i = 0; i < 100; i++) {
			System.out.printf("N[%d] = %.4f\n", i, vetor[i]);
		}
	}
}
