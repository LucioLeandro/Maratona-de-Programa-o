#include<stdio.h>

int main() {

    int vetor[20];
    
    int i;
    
    for(i = 0; i < 20; i++) {
        scanf("%d",&vetor[i]);
    }
    
    int j = 19;
		int aux;
		for(i = 0; i < 10; i ++) {
			aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
			j--;
		}
		
		for(i = 0; i < 20; i++){
            printf("N[%d] = %d\n",i, vetor[i]);
        }
		
}
