#include<stdio.h>

int main() {
  int n;
  int pa, pb;
  float ga, gb;
  int count;
  scanf("%d",&n);

  while(n--) {
    count = 0;
    scanf("%d",&pa);
    scanf("%d",&pb);
    scanf("%f",&ga);
    scanf("%f",&gb);

    while(pa <= pb && count <= 100) {
      pa += pa * (ga/100);
      pb += pb * (gb/100);
      count++;
    }

    if(count > 100) {
      printf("Mais de 1 seculo.\n");
    } else {
      printf("%d anos.\n", count);
    }
  }

  return 0;
}
