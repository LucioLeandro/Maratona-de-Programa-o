#include<stdio.h>
#include<stdlib.h>

main() {
	float matriz[12][12];
	int i, j;
	float soma = 0;
	char op;
	fflush(stdin);
	scanf("%c",&op);
	for(i = 0; i < 12; i++) {
		for(j = 0; j < 12; j++) {
			scanf("%f",&matriz[i][j]);
		}
	}
	int count = 11;
	int countB = 0;
	for(i = 0; i < 12; i++) {
		for(j = 0; j < 12; j++) {
			if(j > count) {
				soma += matriz[i][j];
				countB++;
			}
		}
		count--;
	}
	
	if(op == 'S') {
		printf("%.1f\n", soma);
		
	} else {
		printf("%.1f\n", soma/countB);
	}


}
