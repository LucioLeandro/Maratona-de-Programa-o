import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int leituras;
		int capacidade;
		int saiu;
		int entrou;
		int presente = 0;
		int flag = 0;
		leituras = scanner.nextInt();
		capacidade = scanner.nextInt();
		
		for (int i = 0; i < leituras; i++) {
			saiu = scanner.nextInt();
			entrou = scanner.nextInt();
			presente = presente + entrou - saiu;
			
			if(presente > capacidade) {
				flag = 1;
			}	
		}
		
		if(flag == 1) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}
}
