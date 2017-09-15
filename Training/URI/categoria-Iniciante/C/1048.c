#include<stdio.h>
#include<stdlib.h>

int main() {
	float salario;

	scanf("%f", &salario);

	if(salario >=0 && salario <= 400) {
	 float reajuste = salario * 0.15;
	 printf("Novo salario: %.2f\n", salario + reajuste);
	 printf("Reajuste ganho: %.2f\n", reajuste);
	 printf("Em percentual: 15 %%\n");
	} else if(salario <= 800) {
		float reajuste = salario * 0.12;
		 printf("Novo salario: %.2f\n", salario + reajuste);
		 printf("Reajuste ganho: %.2f\n", reajuste);
		 printf("Em percentual: 12 %%\n");
	} else if(salario <= 1200) {
		float reajuste = salario * 0.10;
		 printf("Novo salario: %.2f\n", salario + reajuste);
		 printf("Reajuste ganho: %.2f\n", reajuste);
		 printf("Em percentual: 10 %%\n");
	} else if(salario <= 2000) {
		float reajuste = salario * 0.07;
		 printf("Novo salario: %.2f\n", salario + reajuste);
		 printf("Reajuste ganho: %.2f\n", reajuste);
		 printf("Em percentual: 7 %%\n");
	} else {
		float reajuste = salario * 0.04;
		 printf("Novo salario: %.2f\n", salario + reajuste);
		 printf("Reajuste ganho: %.2f\n", reajuste);
		 printf("Em percentual: 4 %%\n");
	}
}
