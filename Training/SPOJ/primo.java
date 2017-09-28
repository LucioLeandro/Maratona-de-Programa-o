import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		if(isPrimo(numero)) {
			System.out.println("sim");
		} else {
			System.out.println("nao");
		}
	}
	
	public static boolean isPar(int numero) {
		return numero % 2 == 0;
	}

	private static boolean isPrimo(int numero) {
		int rzq = (int) Math.sqrt(numero);
		
		if(numero != 2 && isPar(numero)){
			return false;
		}
		if(numero <= 3 && numero > 1) {
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
}
