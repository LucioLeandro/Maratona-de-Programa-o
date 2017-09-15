#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int n;
	int soma;
	int count;
	scanf("%d",&n);

	while(n != 0) {
		soma = 0;
		count = 0;
		while(count < 5) {
			if(n % 2 == 0) {
				soma += n;
				count++;
			}
			n++;
		}
		printf("%d\n",soma);
		scanf("%d",&n);
	}
}
