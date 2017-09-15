#include<stdlib.h>
#include<stdio.h>


main() {

	int n, quantia;
	int quantidade = 0;
	float c = 0;
	float r = 0;
	float s = 0;
	char tipo;
	scanf("%d",&n);

	for(int i = 1; i <= n; i++) {
		scanf("%d %c", &quantia, &tipo);

		if(tipo == 'C') {
			c += quantia;
			quantidade += quantia;
		} else if(tipo == 'R') {
			r+= quantia;
			quantidade += quantia;
		} else if(tipo == 'S') {
			s+= quantia;
			quantidade += quantia;
		}
	}

	printf("Total: %d cobaias\n", quantidade);
	printf("Total de coelhos: %.f\n", c);
	printf("Total de ratos: %.f\n", r);
	printf("Total de sapos: %.f\n", s);

	float pc,pr,ps;

	pc = 100*c/quantidade;
	pr = 100*r/quantidade;
	ps = 100*s/quantidade;
	printf("Percentual de coelhos: %.2f %%\n", pc);
	printf("Percentual de ratos: %.2f %%\n", pr);
	printf("Percentual de sapos: %.2f %%\n", ps);

}
