import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		while(!(n == 0 && m == 0)) {
			int s = n + m;
			String soma = Integer.toString(s);
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < soma.length(); i++) {
				if(soma.charAt(i) != '0') {
					sb.append(soma.charAt(i));
				}
			}
			System.out.println(sb);
			n = scanner.nextInt();
			m = scanner.nextInt();
		}
	}
}
