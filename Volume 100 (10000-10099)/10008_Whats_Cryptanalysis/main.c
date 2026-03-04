//Please choose C++11, don't use ANSI C
#include <ctype.h>
#include <stdlib.h>
#include <stdio.h>

typedef struct{
    int val;
    int time;
}count;

int cmp(const void* a, const void* b){
    return ((count*)b)->time - ((count*)a)->time;
}

int main(){
    int t;
    count c[26];
    int i;
    for(i = 0; i < 26; i++){
        c[i].val = i;
        c[i].time = 0;
    }
    scanf("%d", &t);
    //clear the newline character after reading t
    getchar();
    while(t--){
        char s[1000];
        gets(s);
        int i;
        for(i = 0; s[i] != '\0'; i++){
            if(isalpha(s[i])){
                c[toupper(s[i]) - 'A'].time++;
            }else if(islower(s[i])){
                c[toupper(s[i]) - 'a'].time++;
            }
        }
    }
    qsort(c, 26, sizeof(count), cmp);
    for(i = 0; i < 26 && c[i].time > 0; i++){
        printf("%c %d\n", (c[i].val + 'A'), c[i].time);
    }
    return 0;
}