
main() {
	int a, n;
	int soma = 0;
	scanf("%d",&a);
	scanf("%d",&n);
	while(n <= 0) {
		scanf("%d",&n);
	}

	for(int i = 1; i <= n; i++) {
		soma+=a;
		a++;
	}

	printf("%d\n", soma);

}
