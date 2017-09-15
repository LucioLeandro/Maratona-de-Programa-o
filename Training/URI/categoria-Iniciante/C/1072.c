#include<stdlib.h>
#include<stdio.h>


main() {
	int n, numb;
	int countOut, countIn;
	scanf("%d",&n);

	for(int i = 0; i < n; i++) {
		scanf("%d",& numb);

		if(numb >= 10 && numb <=20) {
			countIn++;
		}
	}

	printf("%d in\n", countIn);
	printf("%d out\n", n - countIn);

}
