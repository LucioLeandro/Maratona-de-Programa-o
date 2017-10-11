#include <stdio.h>
#include <stdlib.h>
main() {
	int casos;
	int ra, rb;

	scanf("%d",&casos);

	while(casos--) {
		scanf("%d",&ra);
		scanf("%d",&rb);

		printf("%d\n", ra + rb);
	}

}
