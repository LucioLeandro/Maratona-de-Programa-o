#include<stdlib.h>
#include<stdio.h>

main() {
	int n;
	int countPar = 0;
	int countImpar = 0;
	int countPositivo = 0;
	int countNegativo = 0;

	for(int i = 0; i < 5; i++) {
		scanf("%d",&n);
		if(n > 0) {
			countPositivo++;
		} else if(n < 0) {
			countNegativo ++;
		}

		if(n % 2 == 0 || n == 0) {
			countPar++;
		} else {
			countImpar++;
		}
	}

	printf("%d valor(es) par(es)\n", countPar);
	printf("%d valor(es) impar(es)\n", countImpar);
	printf("%d valor(es) positivo(s)\n", countPositivo);
	printf("%d valor(es) negativo(s)\n",countNegativo);
}
