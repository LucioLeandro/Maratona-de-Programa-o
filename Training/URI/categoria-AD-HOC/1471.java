import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<Integer> lista = new ArrayList<>();
	private static List<Integer> die = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entrou;
		int saiu;

		while (scanner.hasNext()) {
			entrou = scanner.nextInt();
			saiu = scanner.nextInt();
			int numero;

			for (int i = 1; i <= Math.min(entrou, saiu); i++) {
				numero = scanner.nextInt();
				lista.add(numero);
			}

			verificaMortos(entrou);
			if (die.isEmpty()) {
				System.out.println("*");
			} else {
				imprimeMortos();
			}
			lista.clear();
			die.clear();
		}
	}







	public static void imprimeMortos() {
		Collections.sort(die);
		for (Integer num : die) {
			System.out.print(num + " ");
		}
		System.out.println("");
	}

	/**
	 * @param entrou
	 */
	public static void verificaMortos(int entrou) {
		for (int i = 1; i <= entrou; i++) {
			if (!lista.contains(i)) {
				die.add(i);
			}
		}
	}
}
