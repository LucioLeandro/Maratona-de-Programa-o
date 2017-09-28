import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String palavra = scanner.next();
			if(ehPrimo(processa(palavra))) {
				System.out.println("It is a prime word.");
			} else {
				System.out.println("It is not a prime word.");
			}
			
		}
	}

		private static boolean isPar(int num) {
			return num % 2 == 0;
		}
		private static boolean ehPrimo(int numero) {
			int rzq = (int) Math.sqrt(numero);
			
			if(numero != 2 && isPar(numero)){
				return false;
			}
			if(numero <= 3 && numero >= 1) {
				return true;
			}
			
			if(numero == 5) {
				return true;
			}
			
			int j = 3;
			while(j <= rzq) {
				if(numero % j == 0) {
					return false;
				}
				j = j+2;
			}
			
			return true;
		}

	private static int processa(String palavra) {
		int soma = 0;
		for(int i = 0; i < palavra.length(); i ++ ) {
			char let = palavra.charAt(i);
			if(Character.isLowerCase(let)) {
				soma += let - 'a' + 1;
			} else {
				soma += let - 'A' + 27;
			}
		}
		return soma;
	}
}
