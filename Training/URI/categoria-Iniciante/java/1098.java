import java.util.Scanner;;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double i = 0;
		double ii = 1;
		double jj = 1;
		double j = jj;
		int count = 0;
		int countb = 0;


		while(i <= 2) {
			if((i+1) / ii == 1.0) {
				System.out.printf("I=%.0f J=%.0f\n", i, j);
			} else {
				System.out.printf("I=%.1f J=%.1f\n", i, j);
			}

			j++;
			count++;
			if(count == 3) {
				i+=0.2;
				jj+=0.2;
				j = jj;
				countb++;
				count = 0;
			}

			if(countb == 5)	 {
				countb = 0;
				ii++;
			}
		}


	}
}
