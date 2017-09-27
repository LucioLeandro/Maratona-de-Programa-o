import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int consumo = scanner.nextInt();
		int soma = 7;
		
		for(int i = consumo; i > 10; i --) {
			if(i >= 101) {
				soma += 5;
			}
			if(i > 30 && i <= 100) {
				soma += 2;
			}
			if(i > 10 && i <= 30) {
				soma += 1;
			}
		}
		
		System.out.println(soma);
		
		
	}
}
