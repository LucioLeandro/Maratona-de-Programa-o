#include<stdlib.h>
#include<stdio.h>

int menor(int n, int m) {
	if(n < m) {
		return n;
	}

	return m;
}

int maior(int n, int m) {
	if(n > m) {
		return n;
	}

	return m;
}

main() {
	int n, m;

	scanf("%d", &n);
	scanf("%d", &m);
	int soma = 0;
	while(n > 0 && m > 0) {
		for(int i = menor(n,m); i <= maior(n,m); i++) {
			soma += i;
			printf("%d ", i);
		}
		printf("Sum=%d\n",soma);
		soma = 0;
		scanf("%d", &n);
		scanf("%d", &m);

	}

}
