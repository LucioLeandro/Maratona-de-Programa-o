
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int qtdJogos;

		String she, raj;

		qtdJogos = scanner.nextInt();

		for (int i = 1; i <= qtdJogos; i++) {
			she = scanner.next();
			raj = scanner.next();

			String verifica = verifica(she, raj);
			if(verifica.equals("empate")) {
				System.out.println("Caso #" + i + ": De novo!");
			} else {
				if(she.equals(verifica)) {
					System.out.println("Caso #" + i + ": Bazinga!");
				} else {
					System.out.println("Caso #" + i + ": Raj trapaceou!");
				}
			}
		}

	}

	private static String verifica(String she, String raj) {
		if (she.equals("papel")) {
			if (raj.equals("pedra")) {
				return "papel";
			} else if (raj.equals("tesoura")) {
				return "tesoura";
			} else if (raj.equals("lagarto")) {
				return "lagarto";
			} else if (raj.equals("Spock")) {
				return "papel";
			} else if (raj.equals("papel")) {
				return "empate";
			}
		} else if (she.equals("tesoura")) {
			if (raj.equals("Spock")) {
				return "Spock";
			} else if (raj.equals("tesoura")) {
				return "empate";
			} else if (raj.equals("pedra")) {
				return "pedra";
			} else if (raj.equals("lagarto")) {
				return "tesoura";
			} else if (raj.equals("papel")) {
				return "tesoura";
			}
		} else if (she.equals("pedra")) {
			if (raj.equals("Spock")) {
				return "Spock";
			} else if (raj.equals("tesoura")) {
				return "pedra";
			} else if (raj.equals("pedra")) {
				return "empate";
			} else if (raj.equals("lagarto")) {
				return "pedra";
			} else if (raj.equals("papel")) {
				return "papel";
			}
		} else if(she.equals("lagarto")) {
			if(raj.equals("Spock")) {
				return "lagarto";
			} else if(raj.equals("tesoura")) {
				return "tesoura";
			} else if(raj.equals("pedra")) {
				return "pedra";
			} else if(raj.equals("lagarto")) {
				return "empate";
			} else if(raj.equals("papel" )) {
				return "lagarto";
			}
		}

		else if(she.equals("Spock")) {
			if(raj.equals("Spock")) {
				return "empate";
			} else if(raj.equals("tesoura")) {
				return "Spock";
			} else if(raj.equals("lagarto")) {
				return "lagarto";
			} else if(raj.equals("pedra")) {
				return "Spock";
			} else if(raj.equals("papel" )) {
				return "papel";
			}
		}
		return null;


	}
}
