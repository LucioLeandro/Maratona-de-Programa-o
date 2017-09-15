#include<stdlib.h>
#include<stdio.h>


int menor(int x, int y) {
	if(x < y) {
		return x;
	}
	return y;
}

int maior(int x, int y) {
	if(x > y) {
		return x;
	}
	return y;
}


main() {
	int t;
	int x, y;

	scanf("%d", &t);


	int soma = 0;

	int min;
	int max;

	for(int i = 1; i <= t; i++) {
		scanf("%d", &x);
		scanf("%d", &y);

		min = menor(x, y);
		max =maior(x, y);

		for(int j = min + 1; j < max; j++) {
			if(j % 2 != 0) {
				soma += j;
			}
		}
		printf("%d\n", soma);
		soma = 0;
	}


}
