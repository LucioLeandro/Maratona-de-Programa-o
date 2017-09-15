#include<stdlib.h>
#include<stdio.h>


main() {
	int n;

	scanf("%d",&n);

	int i;
	int mult = n;
	for(i = n-1; i >= 2; i--) {
		mult *= i;
	}

	printf("%d\n",mult);


}
