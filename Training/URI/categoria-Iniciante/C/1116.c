#include<stdlib.h>
#include<stdio.h>



main() {

	int t;
	int x, y;
	float resultado;
	scanf("%d", &t);

	for(int i = 0; i < t; i ++) {
		scanf("%d",&x);
		scanf("%d",&y);

		if(y == 0) {
			printf("divisao impossivel\n");
		} else {
			resultado = (float) x/y;

			printf("%.1f\n", resultado);
		}
	}
}
