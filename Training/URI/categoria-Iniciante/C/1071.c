#include<stdlib.h>
#include<stdio.h>
int maior(int x, int y) {
	if(x > y) {

		return x;
	}

	return y;
}

int menor(int x, int y) {
	if(x < y) {
		return x;
	}

	return y;
}

main() {
	int x, y;
	scanf("%d", &x);
	scanf("%d",&y);
	int soma = 0;
	int meno = menor(x, y);
	int maio = maior(x,y);


	for(int i = meno + 1; i < maio; i++) {

		if(i % 2 != 0) {
			soma += i;
		}
	}

	printf("%d\n", soma);

}
