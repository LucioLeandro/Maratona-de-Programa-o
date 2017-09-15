#include<stdlib.h>
#include<stdio.h>


main() {
	int op;
	int pi, pg;
	int count = 0;
	int countI = 0;
	int countG = 0;
	int countE = 0;
	int flag = 0;
	do {
		scanf("%d",&pi);
		scanf("%d",&pg);

		if(pi > pg) {
			countI++;
		} else if(pg > pi) {
			countG++;
		} else {
			countE++;
		}
		count++;

		while(flag == 0) {
			printf("Novo grenal (1-sim 2-nao)\n");
			scanf("%d",&op);
			if(op == 1 || op == 2){
				flag = 1;;
			}
		}

		flag = 0;

	}while(op == 1);

	printf("%d grenais\n",count);
	printf("Inter:%d\n",countI);
	printf("Gremio:%d\n",countG);
	printf("Empates:%d\n", countE);

	if(countI > countG) {
		printf("Inter venceu mais\n");
	} else {
		printf("Gremio venceu mais\n");
	}

}
