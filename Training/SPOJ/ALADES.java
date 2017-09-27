//SPOJ submission 19594006 (JAVA) plaintext list. Status: AC, problem ALADES, contest SPOJBR. By ellucion (El_Lucion), 2017-06-11 22:27:56.

    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
    		int ha, ma;
    		int hb, mb;
    		
    		ha = scanner.nextInt();
    		ma = scanner.nextInt();
    		hb = scanner.nextInt();
    		mb = scanner.nextInt();
    		
    		while(!verifica(ha,hb,ma,mb)) {
    			int saida = 0;
    			
    			if(ha == hb && ma > mb) {
    				saida = 1440;
    			} else if(ha == hb && ma < mb) {
    				saida = 0;
    			} else if (hb < ha) {
    				saida = 1440 - (ha - hb) * 60;
    			}
    			else {
    				saida = (hb - ha) * 60;
    			}
    			saida = saida + (mb - ma);
    			
    			System.out.println(saida);
    			ha = scanner.nextInt();
    			ma = scanner.nextInt();
    			hb = scanner.nextInt();
    			mb = scanner.nextInt();
    		}
    	}
     
    	private static boolean verifica(int ha, int hb, int ma, int mb) {
    		return ha == 0 && hb == 0 && ma == 0 && mb == 0;
    	}
    }
     
