
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int casos =  scanner.nextInt();

		while(casos >= 1) {
			String msg = scanner.next();
			int cifra = scanner.nextInt();

			StringBuilder sb = new StringBuilder(msg);
			int result;
			for(int i = 0; i < sb.length(); i++) {
				result = sb.charAt(i) - cifra;
				if(result >= 65) {
					sb.setCharAt(i, (char) result);
				} else {
					result += 26;
					sb.setCharAt(i, (char) result);
				}
			}
			System.out.println(sb);
			casos--;
		}
	}
}
