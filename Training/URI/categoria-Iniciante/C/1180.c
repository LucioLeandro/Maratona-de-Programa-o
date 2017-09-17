#include<stdio.h>
#include<stdlib.h>

main() {
	int n;
	int *vetor;
	int i;
	int menor;
	int posicao;
	scanf("%d",&n);

	vetor = (int*) malloc(n * sizeof(int));


	for(i = 0; i < n; i++) {
		scanf("%d",&vetor[i]);
	}
	menor = vetor[0];
	posicao = 0;
	for(i = 1; i < n; i++) {
		if(vetor[i] < menor) {
			menor = vetor[i];
			posicao = i;
		}
	}

	printf("Menor valor: %d\n", menor);
	printf("Posicao: %d\n", posicao);


	free(vetor);
}
