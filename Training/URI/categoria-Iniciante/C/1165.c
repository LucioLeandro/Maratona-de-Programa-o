#include<stdio.h>

int main() {

   int nTeste;
   int numero;
   int ehPrimo;
   scanf("%d",&nTeste);

   while(nTeste--) {

       scanf("%d",&numero);
       ehPrimo = 1;
       for(int i = 2; i < numero; i++) {
        if(numero == 2) {
         printf("%d nao eh primo\n",numero);
         break;
        }
          if(numero % i == 0) {
                ehPrimo = 0;
                break;
            }
        }

        if(ehPrimo == 1) {

            printf("%d eh primo\n",numero);
        } else {

             printf("%d nao eh primo\n",numero);
        }

    }
    return 0;
}
