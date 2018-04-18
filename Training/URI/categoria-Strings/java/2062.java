import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdp = sc.nextInt();
		String palavra;
		StringBuilder sb = new StringBuilder();
		while (qtdp > 0) {
			palavra = sc.next();
			if (palavra.length() == 3) {
				sb.append(palavra.charAt(0));
				sb.append(palavra.charAt(1));

				if (sb.toString().equals("UR") || sb.toString().equals("OB")) {
					sb.append("I");
					if(qtdp == 1)
						System.out.println(sb.toString());
					else 
						System.out.print(sb.toString() + " ");
				} else {
					if(qtdp == 1)
						System.out.println(palavra);
					else 
						System.out.print(palavra + " ");
				}
				
				sb = new StringBuilder();
				
			} else {
				if(qtdp == 1)
					System.out.println(palavra);
				else 
					System.out.print(palavra + " ");
			}
			qtdp--;
		}
	}
}
