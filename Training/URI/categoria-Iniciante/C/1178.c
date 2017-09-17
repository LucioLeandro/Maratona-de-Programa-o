#include<stdio.h>
#include<stdlib.h>

main() {
	double n;
	double vetor[100];


	scanf("%lf",&n);

	int i;
	for(i = 0; i < 100; i++) {
		vetor[i] = n;
		n /= 2;
	}

	for(i = 0; i < 100; i++) {
		printf("N[%d] = %.4lf\n", i, vetor[i]);
	}

}
