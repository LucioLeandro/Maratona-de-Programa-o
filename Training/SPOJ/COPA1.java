import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Character> times = new ArrayList<>();

		Character letra = 'A';
		for (int i = 0; i <= 15; i++) {
			times.add(letra);
			letra++;

		}

		int numOne;
		int numTwo;
		int fase = 8;

		while (fase >= 1) {
			for (int i = 0; i < fase; i++) {
				numOne = scanner.nextInt();
				numTwo = scanner.nextInt();

				if (numOne > numTwo) {
					times.remove(i + 1);
				} else {
					times.remove(i);
				}
			}
			fase /= 2;
		}
		
		Character resposta = times.get(0);
		System.out.println(resposta);

	}
}
