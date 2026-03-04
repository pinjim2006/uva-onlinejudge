#include<stdio.h>

int main(){
    while(1){
        int a, b, carry = 0, count = 0;
        scanf("%d %d", &a, &b);
        if(a == 0 && b == 0) break;
        while(a > 0 || b > 0){
            if((a % 10) + (b % 10) + carry >= 10){
                carry = 1;
                count++;
            }else{
                carry = 0;
            }
            a /= 10;
            b /= 10;
        }
        if(count == 0){
            printf("No carry operation.\n");
        }else{
            printf("%d carry operation%s.\n", count, count > 1 ? "s" : "");
        }
    }
    return 0;
}