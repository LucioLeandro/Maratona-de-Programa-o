#include<stdlib.h>
#include<stdio.h>


main() {
	int t;
	int tt = 1;

	scanf("%d",&t);

	for(int i = 1; i <= t; i++) {
		for(int j = 1; j <= 3; j++) {
			printf("%d ",tt);
			tt++;
		}
		printf("PUM\n");
		tt += 1;
	}
}
