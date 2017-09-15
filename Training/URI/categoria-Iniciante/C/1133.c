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

	int x, y;

	scanf("%d",&x);
	scanf("%d",&y);

	for(int i = menor(x,y) + 1; i < maior(x,y); i++) {
		if(i % 5 == 2 || i % 5 == 3) {
			printf("%d\n",i);
		}
	}
}
