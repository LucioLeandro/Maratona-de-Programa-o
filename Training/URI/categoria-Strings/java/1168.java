
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int casos = scanner.nextInt();
		String led;
		int qtd ;
		while(casos >= 1) {
			qtd = 0;
			led = scanner.next();
			StringBuilder sb = new StringBuilder(led);
			qtd = contabiliza(sb);

			System.out.println(qtd + " leds");
			casos--;
		}
	}

	public static int contabiliza(StringBuilder sb) {
		int qtd = 0;
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == '2' || sb.charAt(i) == '3' || sb.charAt(i) == '5') {
				qtd += 5;
			} else if(sb.charAt(i) == '6' || sb.charAt(i) == '9' || sb.charAt(i) == '0') {
				qtd += 6;
			} else if(sb.charAt(i) == '8' ) {
				qtd += 7;
			} else if(sb.charAt(i) == '4') {
				qtd += 4;
			} else if(sb.charAt(i) == '7' ) {
				qtd += 3;
			} else {
				qtd += 2;
			}
		}
		return qtd;
	}
}
