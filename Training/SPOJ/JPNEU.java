import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pBomba = scanner.nextInt();
		int pPneu = scanner.nextInt();
		int resposta = pBomba - pPneu;
		System.out.println(resposta);
		
	}
}
