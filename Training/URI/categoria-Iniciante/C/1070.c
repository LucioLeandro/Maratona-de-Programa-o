#include<stdlib.h>
#include<stdio.h>

main() {
	int n;
	int count = 0;
	scanf("%d", &n);
	while(count < 6) {
		if(n % 2 != 0) {
			count++;
			printf("%d\n", n);
		}
		n++;
	}
}
