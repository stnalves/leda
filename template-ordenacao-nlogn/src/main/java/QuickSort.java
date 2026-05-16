public class QuickSort implements SortingStrategy {

  
    /*
       A mediana de uma sequência de tamanho ímpar é o valor que divide uma sequência ao meio, isto é, 
       metado dos valores são menores que ela, enquanto metade são maiores. Implemente o método abaixo
       que recebe uma sequência de tamanho ímpar e retorna a mediana dessa sequência.
    */
    public int mediana(int[] v) {
        int tam = v.length - 1;
        sort(v, 0, tam);
        return v[tam/2];
    }

    /**
    * Implemente a versão do quick sort usando o particionamento Hoare, que está descrito
    * neste material: https://joaoarthurbm.github.io/eda/posts/particionamento-hoare/
    */
    public void sort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int indexPivot = partition(v, ini, fim);
            sort(v, ini, indexPivot - 1);
            sort(v, indexPivot + 1, fim);
        }
    }

    public int partition(int[] v, int ini, int fim) {
        int i = ini + 1;
        int j = fim;
        int pivot = v[ini];

        while (i <= j) {
            while (i <= j && v[i] <= pivot)
                i++;
        
            while (i <= j && v[j] >= pivot)
                j--;

            if (i < j)
                swap(v, i, j);
        }

        swap(v, ini, j);
        return j;
    }

    public void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }


    /**
    * Nós discutimos em sala de aula que uma tentativa para melhorar a escolha do pivot é
    * decidir usar o valores mediano (não média, cuidado) entre o primeiro elemento do array,
    * o elemento central e o último.

    * Implemente o método abaixo que retorna o valor que seria escolhido como pivot seguindo
    * a abordagem acima.
    * 
    * Interprete os testes para saber qual valor usar como elemento central para calcular a mediana de três.
    */
    public int medianaDeTres(int[] v) {
        int tam = v.length - 1;

        int inicio = v[0];
        int meio = v[tam/2];
        int fim = v[tam];
        
        if (inicio >= meio && inicio <= fim || inicio <= meio && inicio >= fim)
            return inicio;

        else if (inicio <= meio && meio <= fim || inicio >= meio && meio >= fim)
            return meio;
        
        return fim;
    }

}
