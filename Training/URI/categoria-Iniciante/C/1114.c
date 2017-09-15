#include<stdlib.h>
#include<stdio.h>



main() {

	int senha;
	int flag = 0;

	while(flag == 0) {
		scanf("%d",&senha);

		if(senha == 2002) {
			flag = 1;
			printf("Acesso Permitido\n");
		} else {
			printf("Senha Invalida\n");
		}
	}

}
