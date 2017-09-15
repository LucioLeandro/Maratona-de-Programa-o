#include<stdlib.h>
#include<stdio.h>


main() {
	int diesel = 0;
	int gasolina = 0;
	int alcool = 0;;
	int n;
	int flagb = 1;
	int flag;;
	do {
		flag = 0;
		while(flag == 0) {
			scanf("%d",&n);
			if(n >= 1 && n <= 4) {
				flag = 1;
			}
		}

		if(n == 1) {
			alcool++;
		} else if(n == 2) {
			gasolina++;
		} else if(n == 3) {
			diesel++;
		} else {
			flagb = 0;
		}
	}while(flagb == 1);

	printf("MUITO OBRIGADO\n");
	printf("Alcool: %d\n", alcool);
	printf("Gasolina: %d\n", gasolina);
	printf("Diesel: %d\n", diesel);
}
