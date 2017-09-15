#include<stdlib.h>
#include<stdio.h>


main() {
	float soma = 1;
	int i;
	int numerador = 3;
	int denominador = 2;
	while(numerador <= 39) {
		soma += ((float)numerador/(float)denominador);
		numerador += 2;
		denominador *= 2;

	}

	printf("%.2f\n",soma);


}
