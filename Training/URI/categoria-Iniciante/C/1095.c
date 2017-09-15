#include<stdlib.h>
#include<stdio.h>


main() {

	int i = 60;
	int j = 1;
	while(i >= 0) {
		printf("I=%d J=%d\n", j, i);
		i -= 5;
		j += 3;
	}

}
