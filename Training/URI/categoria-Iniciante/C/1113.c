#include<stdlib.h>
#include<stdio.h>

int verifica(int x, int y) {
	if(x < y) {
		return 1;
	}

	return 0;
}
main() {

	int x, y;

	scanf("%d",&x);
	scanf("%d",&y);
	int confere;
	while(x != y) {
		if(verifica(x, y) == 1) {
			printf("Crescente\n");
		} else {
			printf("Decrescente\n");
		}
		scanf("%d",&x);
		scanf("%d",&y);
	}
}
