#include<stdlib.h>
#include<stdio.h>


main() {
	int x;
	int flag = 1;

	scanf("%d",&x);

	while(x != 0) {
		for(int i = 1; i <= x; i++) {
			printf("%d",i);
			if(i < x) {
				printf(" ");
			}
		}
		printf("\n");
		scanf("%d",&x);
	}

}
