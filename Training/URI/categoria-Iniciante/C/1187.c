#include <stdio.h>
#include <stdlib.h>

main() {
	double matriz[12][12];
	int i, j;
	char op;
	fflush(stdin);
	scanf("%c",&op);
	double soma = 0;
	int count = 0;
	for(i = 0; i < 12; i++) {
		for(j = 0; j < 12; j++) {
			scanf("%lf",&matriz[i][j]);
			if(j > i && j < 11-i) {
				soma += matriz[i][j];
				count++;
			}
		}

	}
	if(op == 'S') {
		printf("%.1lf\n", soma);
	} else {
		printf("%.1lf\n", soma/count);
	}
}
