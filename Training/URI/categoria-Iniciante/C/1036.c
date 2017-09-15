#include<stdio.h>
#include<stdlib.h>
#include<math.h>

main() {
	float a, b, c;

	scanf("%f", &a);
	scanf("%f", &b);
	scanf("%f", &c);

	float delta = pow(b,2) - 4 * a * c;

	float raizDelta = sqrt(delta);

	if(raizDelta  >= 0 && (2 * a != 0)) {

		float raiz = (-b + raizDelta) / (2*a);
		printf("R1 = %.5f\n", raiz);

		raiz = (-b - raizDelta) / (2*a);

		printf("R2 = %.5f\n", raiz);
	} else {
		printf("Impossivel calcular\n");
	}
	return 0;

}
