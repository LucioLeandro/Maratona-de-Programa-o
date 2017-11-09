
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String sentence;
		boolean flag = false;
		while(scanner.hasNextLine()) {
			int count = 0;
			sentence = scanner.nextLine();
			StringBuilder sb = new StringBuilder(sentence);

			while(sb.charAt(count) == 32) {
				count++;
			}
			if(sb.charAt(count) > 90) {
				convertMai(count,sb);
				flag = true;
			} else {
				flag = true;
			}

			for(int i = count+1; i < sb.length(); i++) {
				if(sb.charAt(i) != ' ') {
					if(sb.charAt(i) <= 90 && flag && sb.charAt(i) != 32) {
						convetMin(i, sb);
						flag = false;
					}

					else if(sb.charAt(i) <= 90 && !flag && sb.charAt(i) != 32) {
						flag = true;
					}

					else if(sb.charAt(i) > 90 && flag && sb.charAt(i) != 32) {
						flag = false;
					}

					else {
						convertMai(i, sb);
						flag = true;
					}
				}


			}
			System.out.println(sb);
		}
	}

	public static void convertMai(int position, StringBuilder sb) {
		sb.setCharAt(position, (char) (sb.charAt(position) - 32));
	}

	private static void convetMin(int position, StringBuilder sb) {
		sb.setCharAt(position, (char) (sb.charAt(position) + 32));

	}


}
