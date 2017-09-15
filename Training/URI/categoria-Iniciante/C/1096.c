#include<stdlib.h>
#include<stdio.h>


main() {
	int i = 1;
	int j = 7;

	while(i <= 9) {
		printf("I=%d J=%d\n", i, j);
		j--;
		if(j < 5) {
			i+= 2;
			j = 7;
		}
	}
}
