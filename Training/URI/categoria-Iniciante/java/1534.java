import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		while (scanner.hasNext()) {
			numero = scanner.nextInt();
			int j = 0;
			int countInicio = 1;
			int countFinal = numero;
			while (j < numero) {
				for (int i = 1; i <= numero; i++) {
					System.out.print(imprimeNumero(i, countInicio, countFinal));
				}
				System.out.println("");
				countInicio++;
				countFinal--;
				j++;
			}
		}
	}

	private static int imprimeNumero(int i, int countInicio, int countFinal) {
		if(countInicio == i && countFinal == i) {
			return 2;
		}else if (i == countInicio) {
			return 1;
		} else if (i == countFinal) {
			return 2;
		} else if(countInicio == i && countFinal == i) {
			return 2;
		}

		return 3;
	}
}
