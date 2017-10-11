#include <stdio.h>
#include <stdlib.h>

main() {
	int qtdHo;

	scanf("%d",&qtdHo);

	while(qtdHo--) {
		printf("Ho");
		if(qtdHo > 0) {
			printf(" ");
		}
	}

	printf("!\n");

}
