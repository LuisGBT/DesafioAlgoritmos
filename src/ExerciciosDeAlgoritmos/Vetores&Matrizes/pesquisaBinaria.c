#include <stdio.h>


int PesquisaBinaria(int minha_lista[], int item, int tamanho); //Declarando a funcao

int main() {
    int minha_lista[] = {1, 3, 4, 7, 9}; //Minha Lista
    int item = 9; // Item que sera procurado
    
    int res = PesquisaBinaria(minha_lista, item, 5); // 5 é o número de elementos do array

    if (res != -1) {
        printf("Item encontrado no indice: %d\n", res);
    } else {
        printf("Item nao encontrado\n");
    }

    return 0;
}

int PesquisaBinaria(int minha_lista[], int item, int tamanho) {
    int baixo = 0;
    int meio = 0;
    int chute = 0;
    
    // recebe o ultimo indice do array
    int alto = tamanho - 1;

    while (baixo <= alto) {
        meio = (baixo + alto) / 2;
        chute = minha_lista[meio];

        if (chute == item) {
            return meio; // Item encontrado, retorna o índice
        }

        if (chute > item) {
            alto = meio - 1; // Busca da metada para tras do array
        } else {
            baixo = meio + 1; // Busca da metade para frente do array
        }
    }
    
    return -1; // Item não encontrado
}
