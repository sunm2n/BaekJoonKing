#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	double a;
	double b;
	scanf("%lf %lf", &a, &b);
	printf("%.9lf", a/b);
	return 0;
}