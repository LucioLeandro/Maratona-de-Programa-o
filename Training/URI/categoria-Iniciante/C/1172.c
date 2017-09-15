#include<stdio.h>

int main() {

   int vetor[10];
    int x;

    for(int i = 0; i < 10; i++) {

        scanf("%d",&x);
        if(x == 0 || x < 0) {

            vetor[i] = 1;
        } else {
            vetor[i] = x;
        }
    }

    for(int i = 0; i < 10; i++) {
        printf("X[%d] = %d\n",i, vetor[i]);
    }
    return 0;
}
