
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] matriz = new double[12][12];
		int linha;
		double soma = 0;
		String op;

		linha = scanner.nextInt();
		op = scanner.next();

		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 12; j++) {
				matriz[i][j] = scanner.nextDouble();
				if(i == linha) {
					soma += matriz[i][j];
				}
			}
		}



		if(op.equals("S")) {
			System.out.println(soma);
		} else if(op.equals("M" )) {
			System.out.println(soma/12);
		}

	}
}
