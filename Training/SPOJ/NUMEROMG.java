import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String a = scanner.next();
			String b = scanner.next();
			
			if(a.equals("0") && b.equals("0")) {
				break;
			}
			
			
			int x = Integer.parseInt(a, 36);
			int z = Integer.parseInt(b, 36);
			
			int soma = x + z;
			
			System.out.println(Integer.toString(soma, 36).toUpperCase());
		}
	}
}
