import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Character> saida = new ArrayList<>();
		String d;
		String n;

		d = scanner.next();
		n = scanner.next();

		while (!(d.equals("0") && n.equals("0"))) {
			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i) != d.charAt(0)) {
					saida.add(n.charAt(i));
				}
			}

			while (saida.size() > 1 && saida.get(0).equals('0')) {
				saida.remove(0);
			}

			if(saida.isEmpty()) {
				System.out.print("0");
			} else {

				for (Character c : saida) {
					System.out.print(c);
				}
			}

			System.out.println();
			saida.clear();

			d = scanner.next();
			n = scanner.next();
		}
	}
}
