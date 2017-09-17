
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] vetorPar = new int[5];
		int[] vetorImpar = new int[5];

		int n;
		int countPar = 0;
		int countImpar = 0;

		for(int i = 1; i <= 15; i++) {
			n = scanner.nextInt();

			if(n % 2 == 0) {
				vetorPar[countPar] = n;
				countPar++;
			} else {
				vetorImpar[countImpar] = n;
				countImpar++;
			}

			if(countPar == 5) {
				for(int j = 0; j < 5; j++) {
					System.out.println("par[" + j + "] = " + vetorPar[j]);
				}
				countPar = 0;
			}

			if(countImpar == 5) {
				for(int j = 0; j < 5; j++) {
					System.out.println("impar[" + j + "] = " + vetorImpar[j]);
				}
				countImpar = 0;
			}


		}

		for(int i = 0; i < countImpar; i++) {
			System.out.println("impar[" + i + "] = " + vetorImpar[i]);
		}

		for(int i = 0; i < countPar; i++) {
			System.out.println("par[" + i + "] = " + vetorPar[i]);
		}
	}
}
