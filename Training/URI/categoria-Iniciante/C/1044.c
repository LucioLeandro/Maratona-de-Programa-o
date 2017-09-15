#include<stdio.h>
#include<stdlib.h>


int verificaTriangulo(float a, float b, float c) {
	if((a < b+c) && (b < a+c) && (c < a+b)) {
		return 1;
	}

	return 0;
}

main() {
	int a,b;

	scanf("%d",&a);
	scanf("%d",&b);

	if(a > b) {
		if(a%b == 0) {
			printf("Sao Multiplos\n");
		} else {
			printf("Nao sao Multiplos\n");
		}
	} else if (b >a) {
		if(b%a == 0) {
			printf("Sao Multiplos\n");
		} else {
			printf("Nao sao Multiplos\n");
		}
	}
}
