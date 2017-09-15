#include<stdlib.h>
#include<stdio.h>


main() {
	int t;
	int tt = 1;
	scanf("%d",&t);

	for(int i = 1; i <= t; i++) {
		printf("%d %d %d\n",tt, tt*tt, (tt*tt)*tt);
		printf("%d %d %d\n",tt, (tt*tt)+1, ((tt*tt)*tt)+1);
		tt++;
	}
}
