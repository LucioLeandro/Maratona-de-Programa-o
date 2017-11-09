
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int casos = scanner.nextInt();

		while(casos >= 1) {
			String a = scanner.next();
			String b = scanner.next();

			StringBuilder sb = new StringBuilder();

			if(b.length() < a.length()) {
				for(int i = 0; i < b.length(); i++) {
					sb.append(a.charAt(i));
					sb.append(b.charAt(i));
				}
				for(int i = b.length(); i < a.length(); i++) {
					sb.append(a.charAt(i));
				}
			} else {
				for(int i = 0; i < a.length(); i++) {
					sb.append(a.charAt(i));
					sb.append(b.charAt(i));
				}
				for(int i = a.length(); i < b.length(); i++) {
					sb.append(b.charAt(i));
				}
			}
			System.out.println(sb);
			casos--;
		}
	}
}
