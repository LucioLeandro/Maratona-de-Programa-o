#include<stdlib.h>
#include<stdio.h>

int verifica(float n) {
	if(n >= 0 && n <= 10) {
		return 1;
	}

	return 0;
}

main() {

	float a = -1;
	float  b = -1;
	float n;
	int flag = 0;
	while(flag == 0) {
		scanf("%f", &n);


		if(verifica(n) == 1) {
			if(a == -1) {
				a = n;
			} else {
				b = n;
			}
		} else {
			printf("nota invalida\n");
		}

		if(a != -1 && b != -1) {
			printf("media = %.2f\n", (a+b)/2);
			flag = 1;
		}

	}

}
