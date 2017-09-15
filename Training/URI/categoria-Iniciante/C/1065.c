#include<stdlib.h>
#include<stdio.h>

main() {
	int n;
	int count;
	for(int i = 0; i < 5; i++) {
		scanf("%d", &n);
		if(n % 2 == 0) {
			count++;
		}
	}

	printf("%d valores pares\n", count);
}
