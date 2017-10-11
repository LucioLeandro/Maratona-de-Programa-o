
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rec;

		while(scanner.hasNext()) {
			rec = scanner.nextInt();

			if(rec > 0) {
				System.out.println("vai ter duas!");
			} else if(rec == 0){
				System.out.println("vai ter copa!");
			}
		}


	}
}
