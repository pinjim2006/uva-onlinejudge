#include <stdio.h>
#include <math.h>

int main(){
    while(1){
        int a, b, result = 0;
        scanf("%d %d", &a, &b);
        if(a == 0 && b == 0) break;
        result += (int)sqrt(b) - (int)sqrt(a);
        result += (int)sqrt(a) - sqrt(a) == 0;
        printf("%d\n", result);
        
    }
    return 0;
}