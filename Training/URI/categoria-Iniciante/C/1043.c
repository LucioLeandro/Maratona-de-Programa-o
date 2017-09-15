#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int verificaTriangulo(float a, float b, float c) {
	if((a < b+c) && (b < a+c) && (c < a+b)) {
		return 1;
	}

	return 0;
}

main() {
	float a,b,c;

	scanf("%f",&a);
	scanf("%f",&b);
	scanf("%f",&c);

	int verifica = verificaTriangulo(a,b,c);

	if(verifica == 1) {
		printf("Perimetro = %.1f\n", a+b+c);
	} else {
		printf("Area = %.1f\n", ((a+b)*c)/2);
	}


}
