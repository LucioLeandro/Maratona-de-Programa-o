
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String mensagem = scanner.nextLine();
		String maior = "";

		while(!mensagem.equals("0")) {
			int soma = 0;
      
			for(int i = 0; i < mensagem.length(); i++) {

				if(mensagem.charAt(i) != ' ') {
					soma ++;
				} else {
					System.out.print(soma + "-");
					if(soma >= maior.length()) {
						maior = mensagem.substring(i-soma, i);
					}
					soma = 0;
				}
				if(i == mensagem.length() -1) {
					if(soma >= maior.length()) {
						maior = mensagem.substring(mensagem.length() - soma, mensagem.length());
					}
				}
			}
			System.out.println(soma);
			mensagem = scanner.nextLine();
		}
		System.out.println();
		System.out.println("The biggest word: " + maior);

	}
}
