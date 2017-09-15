#include<stdlib.h>
#include<stdio.h>


main() {
	int idade;
	int soma = 0;
	int count = 0;

	scanf("%d",&idade);

	while(idade >= 0) {
		soma+=idade;
		count++;
		scanf("%d",&idade);
	}

	printf("%.2f\n", (float)soma/(float)count);


}
