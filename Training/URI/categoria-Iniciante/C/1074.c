#include<stdlib.h>
#include<stdio.h>


main() {
	int n, numb;
	scanf("%d",&n);

	for(int i = 0; i < n; i++) {
		scanf("%d",&numb);

		if(numb == 0) {
			printf("NULL\n");
		} else if(numb % 2 == 0) {
			printf("EVEN ");
			if(numb > 0) {
				printf("POSITIVE\n");
			} else {
				printf("NEGATIVE\n");
			}
		} else {
			printf("ODD ");
			if(numb > 0) {
				printf("POSITIVE\n");
			} else {
				printf("NEGATIVE\n");
			}
		}
	}


}
