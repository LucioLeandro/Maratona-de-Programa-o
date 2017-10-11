
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int qtdCasos;
		int n = 0;
		int aux;
		while(scanner.hasNext()) {
			qtdCasos = scanner.nextInt();

			for(int i = 0; i < qtdCasos; i++) {
				aux = scanner.nextInt();
				if(aux > n) {
					n = aux;
				}
			}

			if(n < 10) {
				System.out.println("1");
			} else if( n >= 10 && n < 20) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}

			n = 0;
		}

	}
}
