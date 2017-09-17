#include<stdio.h>
#include<stdlib.h>

main() {
	int vetorPar[5];
	int vetorImpar[5];
	int n,i,j;
	int countPar = 0;
	int countImpar = 0;
	for(i = 0; i < 15; i++) {
		scanf("%d",&n);

		if(n % 2 == 0) {
			vetorPar[countPar] = n;
			countPar++;
		} else {
			vetorImpar[countImpar] = n;
			countImpar++;
		}

		if(countPar == 5) {
			for(j = 0; j < 5; j++) {
				printf("par[%d] = %d\n",j, vetorPar[j]);
			}

			countPar = 0;
		}

		if(countImpar == 5) {
			for(j = 0; j < 5; j++) {
				printf("impar[%d] = %d\n",j, vetorImpar[j]);
				countImpar = 0;
			}

		}
	}

	for(i = 0; i < countImpar; i++) {
		printf("impar[%d] = %d\n", i, vetorImpar[i]);
	}

	for(i = 0; i < countPar; i++) {
		printf("par[%d] = %d\n", i, vetorPar[i]);
	}
}
