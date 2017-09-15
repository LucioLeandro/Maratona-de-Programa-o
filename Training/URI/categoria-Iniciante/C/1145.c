#include<stdlib.h>
#include<stdio.h>


main() {
	int x,y;
	int count = 0;
	scanf("%d",&x);
	scanf("%d",&y);


	for(int i = 1; i <= y; i++) {
		printf("%d",i);
		count++;
		if(count < x) {
			printf(" ");
		} else {
			printf("\n");
			count = 0;
		}

	}
}
