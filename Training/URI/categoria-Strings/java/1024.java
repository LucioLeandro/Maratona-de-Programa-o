
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Character> letras = new ArrayList<>();

		int qtdCasos = scanner.nextInt();
		scanner.nextLine();
		String msg;
		for(int i = 1; i <= qtdCasos; i++) {
			msg = scanner.nextLine();

			//Primeira passada

			for(int j = 0; j < msg.length(); j++) {
				char letra;
				letra = msg.charAt(j);
				if(Character.isLetter(letra) ) {
					letra += 3;
				}
				letras.add(letra);
			}

			//Segunda passada

			int k = 0;
			int l = letras.size() - 1;

			while(k < (letras.size() / 2)) {
				char aux = letras.get(k);
				letras.set(k, letras.get(l));
				letras.set(l, aux);
				k++;
				l--;
			}

			// Terceira passada

			for(int m = letras.size() / 2; m < letras.size(); m++) {
				letras.set(m, (char) (letras.get(m) - 1));
			}

      // impressao de Characteres
      	
			for(Character letra : letras) {
				System.out.print(letra);
			}
			System.out.println();
			letras.clear();
		}


	}

}
