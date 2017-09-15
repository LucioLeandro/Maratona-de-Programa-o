#include<stdlib.h>
#include<stdio.h>

main() {
	float salario;
	scanf("%f", &salario);
	if(salario <= 2000) {
		printf("Isento\n");
	} else if(salario > 2000.00 && salario <= 3000.00) {
		salario -= 2000;
		salario *= 0.08;
		printf("R$ %.2f\n", salario);
	} else if(salario > 3000 && salario <= 4500) {
		float imposto = 80;
		salario -= 3000;
		imposto += salario * 0.18;
		printf("R$ %.2f\n", imposto);
	} else if(salario > 4500) {
		float imposto = 350;
		salario -= 4500;
		imposto += salario * 0.28;
		printf("R$ %.2f\n", imposto);

	}
}
