#include<stdio.h>
main() {
	double matriz[12][12];
	int linha;
	int i,j;
	double n;
	char operacao;
	double calculo = 0;
	scanf("%d",&linha);
	fflush(stdin);
	scanf("%c",&operacao);

	for(i = 0; i < 12; i++) {
		for(j = 0; j < 12; j ++) {
			scanf("%lf",&matriz[i][j]);
			if(i == linha) {
				calculo += matriz[i][j];
			}
		}
	}


	if(operacao == 'S') {
		printf("%.1lf\n", calculo);
	} else {
		printf("%.1lf\n", calculo/12);
	}
}
	
