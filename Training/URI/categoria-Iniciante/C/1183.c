#include<stdio.h>
main() {
	float matriz[12][12];
	float soma = 0;
	int count = 0;
	char op;
	fflush(stdin);
	scanf("%c",&op);
	int i,j;
	for(i = 0; i < 12; i++) {
		for(j = 0; j < 12; j++) {
			scanf("%f",&matriz[i][j]);
		if(j > i) {
				soma += matriz[i][j];
				count++;
			}
		}
	}
	float media;
	if(op == 'S') {
		printf("%.1f\n", soma);
	} else if(op == 'M'){
		media = soma/12;
		printf("%.1f\n", soma/count);
	}
}
	
