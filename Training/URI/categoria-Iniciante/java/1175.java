import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] vetor = new int[20];
		
		for(int i = 0; i < 20; i++) {
			vetor[i] = scanner.nextInt();
		}
		
		int j = 19;
		int aux;
		for(int i = 0; i < 10; i ++) {
			aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
			j--;
		}
		
		for(int i = 0; i < 20; i ++) {
			System.out.println("N[" + i +"] = " + vetor[i]);
		}
		
		
		
	}
}
