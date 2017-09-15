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
	int x,y;
	int soma = 0;

	scanf("%d",&x);
	scanf("%d",&y);
	for(int i = menor(x,y); i <= maior(x, y); i++) {
		if(i % 13 != 0) {
			soma += i;
		}
	}

	printf("%d\n",soma);

}
