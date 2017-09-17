
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int menor, posicao;
		int[] vetor = new int[n];

		for(int i = 0; i < n; i++) {
			vetor[i] = scanner.nextInt();
		}

		menor = vetor[0];
		posicao = 0;

		for(int i = 1; i < n; i++) {
			if(vetor[i] < menor) {
				menor = vetor[i];
				posicao = i;
			}
		}

		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);

	}
}
