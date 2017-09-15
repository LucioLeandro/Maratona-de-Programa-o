#include<stdio.h>
#include<stdlib.h>
#include<math.h>


main() {
	float valores[3];
	float aux;
	scanf("%f", &valores[0]);
	scanf("%f", &valores[1]);
	scanf("%f", &valores[2]);
	int i;
	int j;
	for(i = 0; i < 2; i ++) {
		for(j = 1; j < 3; j++) {
			if(valores[j] > valores[i]) {
				aux = valores[i];
				valores[i] = valores[j];
				valores[j] = aux;
			}
		}
	}

	float a = valores[0];
	float b = valores[1];
	float c = valores[2];



	if(a >= b+c) {
		printf("NAO FORMA TRIANGULO\n");
	} else {
		if((a*a) == ((b*b) + (c*c)) ) {
			printf("TRIANGULO RETANGULO\n");
		}

		if((a*a) > ((b*b) + (c*c))) {
			printf("TRIANGULO OBTUSANGULO\n");
		}

		if((a*a) < ((b*b) + (c*c))) {
			printf("TRIANGULO ACUTANGULO\n");
		}

		if(a == b && b == c) {
			printf("TRIANGULO EQUILATERO\n");
		}

		if((a == b && a != c) || (b == c && b != a) || (c == a && a != b)) {
			printf("TRIANGULO ISOSCELES\n");
		}
	}


}
