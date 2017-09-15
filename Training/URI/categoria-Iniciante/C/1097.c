#include<stdlib.h>
#include<stdio.h>


main() {
	int i = 1;
	int j = 7;
	int count = 0;
	while(i <= 9) {
		printf("I=%d J=%d\n", i, j);
		count++;
		j--;
		if(count == 3) {
			j += 5;
			i += 2;
			count = 0;
		}
	}
}
