import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<Integer> lista = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamanho;
		int instancia = 1;
		int numero;

		while (scanner.hasNext()) {
			boolean flag = false;
			tamanho = scanner.nextInt();
			
			if (tamanho > 0) {
				for (int i = 0; i < tamanho; i++) {
					numero = scanner.nextInt();
					if (tamanho == 1) {
						imprimeSaida(numero, instancia);
						flag = true;
					} else if (tamanho > 1) {
						if (verificaSoma(numero)) {
							imprimeSaida(numero, instancia);
							scanner.nextLine();
							flag = true;
							break;
						} else {
							lista.add(numero);
						}
					}
				}
				if(!flag) {
					System.out.println("Instancia " + instancia);
					System.out.println("nao achei");
					System.out.println("");
				}
				
			}
			instancia++;
			lista.clear();
		}

	}

	private static boolean verificaSoma(int numero) {
		int soma = 0;
		if (lista.isEmpty()) {
			return false;
		}
		for (Integer num : lista) {
			soma += num;
		}

		if (soma == numero) {
			return true;
		}
		return false;
	}

	private static void imprimeSaida(int numero, int instancia) {
		System.out.println("Instancia " + instancia);
		System.out.println(numero);
		System.out.println("");
	}
}
