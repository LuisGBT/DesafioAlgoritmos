#include <stdio.h>

int main() {
    char caractere;
    printf("Informe uma letra\n");
    scanf("%s", &caractere);

    switch (caractere) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        printf("é uma vogal");
            break;
        case 'b':
        case 'c':
        case 'd':
        case 'f':
        case 'g':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            printf("é uma concoante");
            break;
        default:
            printf("é Invalido!!");
            break;
    }
    return 0;
}