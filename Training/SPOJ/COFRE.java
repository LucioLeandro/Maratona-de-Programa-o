//SPOJ submission 19599281 (JAVA) plaintext list. Status: AC, problem COFRE, contest SPOJBR. By ellucion (El_Lucion), 2017-06-12 20:03:44.

    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
    		int teste = 1;
    		int j;
    		int n;
    		
    		int numDeposito = scanner.nextInt();
    	
    		while(numDeposito != 0) {
    			j = 0;
    			n = 0;
    			System.out.println("Teste " + teste);
    			for (int i = 1; i <= numDeposito; i++) {
    				j += scanner.nextInt();
    				n += scanner.nextInt();
    				System.out.println(j - n);
    			}
    			teste++;
    			numDeposito = scanner.nextInt();
    		}
    		
    	}
    }
     
