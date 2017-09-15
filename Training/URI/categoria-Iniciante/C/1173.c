#include<stdio.h>

int main() {

   int vetor[10];
   int numero;

   scanf("%d",&numero);

   for(int i = 0; i < 10; i ++) {
        vetor[i] = numero;
        numero *= 2;
    }

    for(int i = 0; i < 10; i++) {
        printf("N[%d] = %d\n", i, vetor[i]);

    }
}
