import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int segundos = scanner.nextInt();

		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int segu = (segundos % 3600) % 60;

		System.out.println(horas + ":" + minutos + ":" + segu);


	}
}
