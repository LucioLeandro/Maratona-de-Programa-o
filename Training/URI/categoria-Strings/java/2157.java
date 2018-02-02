import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		int b, e, diference;
		while (c >= 1) {
			b = scanner.nextInt();
			e = scanner.nextInt();
			diference = e - b;

			for (int i = 0; i <= diference; i++) {
				System.out.print(b);
				b++;
			}

			for (int i = 0; i <= diference; i++) {
				if (e > 9) {
					String n = Integer.toString(e);

					for (int j = n.length() - 1; j >= 0; j--) {
						System.out.print(n.charAt(j));
					}
				} else {
					System.out.print(e);
				}
				e--;
			}
			System.out.println();
			c--;
		}
	}
}
