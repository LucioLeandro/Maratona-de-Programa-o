#include<stdlib.h>
#include<stdio.h>


main() {
	int n;
	int anterior = 0;
	int atual = 1;
	int i;
	int soma;
	scanf("%d",&n);
	if(n == 1) {
		printf("%d\n", anterior);
	} else if(n == 2) {
		printf("%d %d\n", anterior, atual);
	} else {
		printf("%d %d ", anterior, atual);

		for(i = 3; i <= n; i++) {
			soma = anterior + atual;
			printf("%d", soma);
			anterior = atual;
			atual = soma;
			if(i < n) {
				printf(" ");
			}
		}
		printf("\n");
	}

}
