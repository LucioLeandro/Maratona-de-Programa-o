import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int casos = scanner.nextInt();
		int l, c;
		int soma = 0;
		for(int i = 0; i < casos; i++) {
			l = scanner.nextInt();
			c = scanner.nextInt();
			if(l > c) {
				soma += c;
			}
		}
		
		System.out.println(soma);
	}
}
