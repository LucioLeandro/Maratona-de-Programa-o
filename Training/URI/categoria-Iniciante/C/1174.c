#include<stdio.h>

int main() {

   float vetor[100];
   int numero;

   for(int i = 0; i < 100; i++){
        scanf("%f",&vetor[i]);
    }

   for(int i = 0; i < 100; i++){
        if(vetor[i] <= 10) {
            printf("A[%d] = %.1f\n",i, vetor[i]);
        }
    }
}
   
