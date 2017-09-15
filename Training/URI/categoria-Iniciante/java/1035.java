import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a  = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		boolean flag = false;

		if(b > c && d > a) {
			if((c+d) > (a+b)) {
				if(c > 0 && d > 0) {
					if(a % 2 == 0) {
						flag = true;
					}
				}
			}
		}

		if(flag) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}
