#include<stdio.h>

int main() {

    int nteste;
    int numero;
    int soma;
    scanf("%d",&nteste);

    while(nteste--) {
        scanf("%d",&numero);
        soma = 0;
        for(int i = 1; i <= numero-1; i++) {
            if(numero % i == 0) {
                soma += i;

            }

            if(soma > numero) {

                break;
            }

        }

        if(soma == numero) {
            printf("%d eh perfeito\n",numero);
        } else {
            printf("%d nao eh perfeito\n",numero);
        }

    }
    return 0;
}
