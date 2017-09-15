#include<stdlib.h>
#include<stdio.h>


main() {
	float soma = 1;
	int i;
	for(i = 2; i <= 100; i++) {
		soma += (1/(float)i);
	}

	printf("%.2f\n",soma);


}
