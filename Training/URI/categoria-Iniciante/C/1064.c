#include<stdlib.h>
#include<stdio.h>

main() {
	float n;
	int count = 0;
	float soma = 0;

	for(int i = 0; i < 6; i ++) {
		scanf("%f",&n);
		if(n > 0) {
			count++;
			soma += n;
		}
	}

	printf("%d valores positivos\n", count);
	printf("%.1f\n", soma/count);
}
