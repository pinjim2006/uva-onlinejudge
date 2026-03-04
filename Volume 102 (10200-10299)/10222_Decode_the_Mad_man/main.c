//Please choose C++11, don't use ANSI C
#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main() {
    char c;
    const char *key = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
    
    while (scanf("%c", &c) != EOF) {
        c = tolower(c);
        if (c == ' ' || c == '\n') {
            printf("%c", c);
        } else {
            for (int i = 0; key[i] != '\0'; i++) {
                if (key[i] == c) {
                    printf("%c", key[i - 2]);
                    break;
                }
            }
        }
    }
    return 0;
}   