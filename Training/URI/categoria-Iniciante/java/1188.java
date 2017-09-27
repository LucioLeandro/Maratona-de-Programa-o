import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] matriz = new double[12][12];
		
		String op = scanner.nextLine();
		
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 12; j++) {
				matriz[i][j] = scanner.nextDouble();
			}
		}
		double soma = 0;
		int count = 0;
		for(int i = 11; i >= 0; i--) {
			for(int j = 0; j < 12; j++) {
				if(j < i && j > 11 - i) {
					soma += matriz[i][j];
					count++;
				}
			}
		}
		
		if(op.equals("S")) {
			System.out.printf("%.1f\n", soma);
		} else {
			System.out.printf("%.1f\n", soma/count);
		}
		
	}
}
