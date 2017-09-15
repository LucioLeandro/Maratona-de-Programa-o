#include<stdlib.h>
#include<stdio.h>


main() {
	int n;
	int x,y;
	int i;
	int j;
	int soma;
	int count;
	scanf("%d",&n);
	for(i = 1; i <= n; i++)	 {
		count = 0;
		scanf("%d",&x);
		scanf("%d",&y);
		soma = 0;
		while(count < y) {
			if(x % 2 != 0) {
				soma += x;
				count++;
			}
			x++;
		}
		printf("%d\n", soma);
	}
}
