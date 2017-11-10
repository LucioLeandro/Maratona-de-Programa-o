
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int casos = scanner.nextInt();
			scanner.nextLine();
			String print;

			while(casos >= 1) {
				print = scanner.nextLine();
				StringBuilder sb = new StringBuilder();
				for(int i = (print.length() / 2) - 1; i >= 0; i--) {
					sb.append(print.charAt(i));
				}
				for(int i = print.length() - 1; i > (print.length() / 2) - 1; i--) {
					sb.append(print.charAt(i));
				}	
				System.out.println(sb);
				casos--;
			}
		}

}
