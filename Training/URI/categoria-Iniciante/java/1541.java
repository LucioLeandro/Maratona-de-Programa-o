
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;

		a = scanner.nextInt();
		while(a != 0) {
			b = scanner.nextInt();
			c = scanner.nextInt();

			int tCasa = a * b;
			int tTerreno = (tCasa * 100) / c;

			System.out.println( (int) Math.sqrt(tTerreno));
			a = scanner.nextInt();
		}
	}
}
