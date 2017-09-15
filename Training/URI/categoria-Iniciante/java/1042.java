import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> sort = new ArrayList<>();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		sort.add(a);
		sort.add(b);
		sort.add(c);

		Collections.sort(sort);

		for(Integer numero : sort) {
			System.out.println(numero);

		}

		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}
}
