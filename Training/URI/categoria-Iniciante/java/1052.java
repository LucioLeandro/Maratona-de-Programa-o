import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] meses = {"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"};

		int number = scanner.nextInt();

		if(number >=1 && number <= 12) {
			System.out.println(meses[number-1]);
		}
	}
}
