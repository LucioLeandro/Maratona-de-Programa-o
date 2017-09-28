#include <stdio.h>
#include <stdlib.h>

main() {
	int l, c, soma, somaGeral = 0, somaLinha = 0;
	
		scanf("%d", &l);
		scanf("%d", &c);
		int matriz[l][c];
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				scanf("%d", &matriz[i][j]);
			}
		}
		
		for(int i = 0; i < c; i ++) {
				soma = 0;
				for(int j = 0; j < l; j ++) {
					soma += matriz[j][i];
				}
				if(somaGeral < soma) {
					somaGeral = soma;
					
				}				
			}
			
		for(int i = 0; i < l; i ++) {
			soma = 0;
			for(int j = 0; j < c; j ++) {
				soma += matriz[i][j];
			}
			if(somaLinha < soma) {
				somaLinha = soma;
					
			}				
		}
		
		if(somaGeral > somaLinha) {
			printf("%d", somaGeral);
		} else {
			printf("%d", somaLinha);
		}
			
	return 0;
}
