import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x =0;
		int y = 0;
		while(t > 0) {
			
			StringBuilder sb = new StringBuilder();
			String conta = sc.next();
			for(int i = 0; i < conta.length(); i++) {
				if(conta.charAt(i) >= 48 && conta.charAt(i) <= 57) {
					sb.append(conta.charAt(i));
				}
				else {
					x = Integer.parseInt(sb.toString());
					sb = new StringBuilder();
				}
			}
			y = Integer.parseInt(sb.toString());
			
			if(x != y) {
				for(int i = 5; i <= 10; i++) {
					System.out.println(x + " x " + i + " = " + x * i + " && " + y + " x " + i + " = " + y * i);
				}
			} else {
				for(int i = 5; i <= 10; i++) {
					System.out.println(x + " x " + i + " = " + x * i);
				}
			}
			
			
			t--;
		}
	}
}
