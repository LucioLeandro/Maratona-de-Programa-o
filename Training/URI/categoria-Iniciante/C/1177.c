#include<stdio.h>
#include<stdlib.h>

main() {
	int n;
	int vetor[1000];
	scanf("%d",&n);

	int i,count = 0;

	for(i = 0; i < 1000; i++) {
			vetor[i] = count;
			count++;
			if(count == n) {
				count = 0;
			}
	}

	for(i = 0; i < 1000; i++) {
		printf("N[%d] = %d\n", i, vetor[i]);
	}
}
