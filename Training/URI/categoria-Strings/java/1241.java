
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int casos = scanner.nextInt();
		boolean flag;
		while(casos >= 1) {
			String a = scanner.next();
			String b = scanner.next();
			flag = true;

			int begin = a.length() - b.length();

			if(begin >= 0) {
				for(int i = begin; i < a.length(); i++) {
					if(!(a.charAt(i) == b.charAt(i - begin))) {
						flag = false;
						break;
					}
				}

			} else if(begin < 0) {
				flag = false;
			}

			if(flag) {
				System.out.println("encaixa");
			} else {
				System.out.println("nao encaixa");
			}
			casos--;
		}
	}

}
