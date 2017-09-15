import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x;
		double y;
		x = scanner.nextDouble();
		y = scanner.nextDouble();

		System.out.println(verificaQuadrante(x,y));

	}

	private static String verificaQuadrante(double x, double y) {
		if(x == 0.0 && y == 0.0) {
			return "Origem";
		} else if(x > 0 && y > 0) {
			return "Q1";
		} else if (x > 0 && y < 0) {
			return "Q4";

		}else if(x < 0 && y < 0) {
			return "Q3";

		} else if(x < 0 && y > 0) {
			return "Q2";
		} else if(x == 0 && y > 0 || x == 0 && y < 0) {
			return "Eixo Y";
		}
			return "Eixo X";
	}
}
