
import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] vetor = new int[1000];


		int n = scanner.nextInt();
		int count = 0;

		for(int i = 0; i < 1000; i++) {
			vetor[i] = count;
			count++;
			if(count == n)
				count = 0;
		}
		for(int i = 0; i < 1000; i++) {
			System.out.println("N[" + i + "] = " + vetor[i]);
		}
	}
}
