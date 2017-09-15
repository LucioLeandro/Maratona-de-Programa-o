#include<stdlib.h>
#include<stdio.h>


main() {
	int x, z;
	int count = 0;
	scanf("%d",&x);
	scanf("%d",&z);

	while(z <= x) {
		scanf("%d",&z);
	}
	int i;
	int soma;
	for(i = 1; soma <= z; i++) {
		soma += x;
		x++;
		count++;
	}

	printf("%d\n", count);

}
