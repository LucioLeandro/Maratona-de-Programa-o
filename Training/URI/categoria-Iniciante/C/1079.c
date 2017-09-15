#include<stdlib.h>
#include<stdio.h>


main() {
	int t;
	float n;
	float soma;
	scanf("%d", &t);

	for(int i = 0; i < t; i++) {
		soma = 0;
		for(int j = 0; j < 3; j++) {
			scanf("%f", &n);
			if(j == 0) {
			soma += (n*2);
			} else if(j == 1) {
				soma += (n*3);
			} else {
				soma += (n*5);
			}

		}

		printf("%.1f\n",soma/10);
	}
}
