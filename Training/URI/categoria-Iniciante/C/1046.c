#include<stdio.h>
#include<stdlib.h>
#include<math.h>


main() {
	int hi, hf;
	scanf("%d", &hi);
	scanf("%d", &hf);


	if(hf > hi) {
		printf("O JOGO DUROU %d HORA(S)\n", hf - hi);
	} else if(hi > hf) {
		hf+= 24;

		printf("O JOGO DUROU %d HORA(S)\n", hf-hi);
	} else {
			printf("O JOGO DUROU 24 HORA(S)\n");
	}



}
