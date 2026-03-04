#include <stdio.h>

int len(int n){
	int r = 1;
	while(n != 1){
		if(n % 2 == 1){
			n = 3 * n + 1;
		}else{
			n /= 2;
		}
		r++;
	}
	return r;
}

int main(){
	int i, j;
	while(scanf("%d %d", &i, &j) != EOF){
		if(i <= j){
			int max = len(i), k;
			for(k = i; k <= j; k++){
				max = len(k) > max ? len(k) : max;
			}
			printf("%d %d %d\n", i, j, max);
		}else{
			int max = len(j), k;
			for(k = j; k <= i; k++){
				max = len(k) > max ? len(k) : max;
			}
			printf("%d %d %d\n", i, j, max);
		}
	}
	return 0;
}