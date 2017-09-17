//codigo ainda não aceito
#include<stdio.h>
main() {
	double matriz[12][12];
	int coluna;
	int i,j;
	char operacao;
	double calculo = 0;
	scanf("%d",&coluna);
	fflush(stdin);
	scanf("%c",&operacao);

	for(i = 0; i < 12; i++) {
		for(j = 0; j < 12; j ++) {
			scanf("%lf",&matriz[i][j]);
			if(j == coluna) {
				calculo += matriz[i][j];
			}
		}
	}


	if(operacao == 'S') {
		printf("%.1lf\n", calculo);
	} else if(operacao == 'M'){
		printf("%.1lf\n", calculo/12);
	}
}
