import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rodadas = scanner.nextInt();
		int j = 1;
		while (rodadas != 0) {
			String nomeOne = scanner.next();
			String nomeTwo = scanner.next();
			int a, b;
			if (nomeIsValid(nomeOne, nomeTwo)) {
				System.out.println("Teste " + j);
				for (int i = 1; i <= rodadas; i++) {
					a = scanner.nextInt();
					b = scanner.nextInt();
					System.out.println(vencedor(a, b, nomeOne, nomeTwo));
				}
				j++;
			}

			rodadas = scanner.nextInt();
		}

	}

	private static String vencedor(int a, int b, String nomeOne, String nomeTwo) {
		if(isPar(a,b)) {
			return nomeOne;
		}
		return nomeTwo;
	}

	private static boolean isPar(int a, int b) {
		
		return (a+b) % 2 == 0;
	}

	private static boolean nomeIsValid(String nomeOne, String nomeTwo) {
		return nomeOne.length() >= 1 && nomeOne.length() <= 10 && nomeTwo.length() >= 1 && nomeTwo.length() <= 10;
	}
}
