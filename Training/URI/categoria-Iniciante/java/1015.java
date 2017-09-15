import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double xa ,xb, ya, yb;

		xa = scanner.nextDouble();
		ya = scanner.nextDouble();
		xb = scanner.nextDouble();
		yb = scanner.nextDouble();

		System.out.printf("%.4f", Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2)));
		System.out.println();

	}
}
