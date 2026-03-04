#include <stdio.h>
#include <stdlib.h>

int cmp(const void * a, const void * b){
	return *(int*)a - *(int*)b;
}

int main(){
	int t;
	scanf("%d", &t);
	while(t--){
		int r, ans = 0;
		scanf("%d", &r);
		int s[r], i;
		for(i = 0; i < r; i++){
			scanf("%d", &s[i]);
		}
		qsort(s, r, sizeof(int), cmp);
		int mid = s[r / 2];
		for(i = 0; i < r; i++){
			ans += abs(s[i] - mid);
		}
		printf("%d\n", ans);
	}
	return 0;
}

