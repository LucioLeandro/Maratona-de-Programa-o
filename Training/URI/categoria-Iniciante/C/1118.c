#include<stdlib.h>
#include<stdio.h>
int validaNota(int n) {
	if(n >= 0 && n <= 10) {
		return 1;
	}

	return 0;
}

main() {
	int op = 1;
	float n;
	float notaA = -1;
	float notaB;
	int flag = 0;
	do {

		while(flag == 0){
			scanf("%f",&n);
			if(validaNota(n) == 1) {
				if(notaA == -1) {
					notaA = n;
				} else {
					notaB = n;
					flag = 1;
				}
			} else {
				printf("nota invalida\n");
			}

	}

	printf("media = %.2f\n", (notaA + notaB)/2);
	notaA = -1;
	while(flag == 1) {
		printf("novo calculo (1-sim 2-nao)\n");
		scanf("%d",&op);
		if(op == 1 || op == 2) {
			flag = 0;
		}
	}
	}while(op == 1);
}
