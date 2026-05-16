
public class MergeSort implements SortingStrategy {

    /**
    * Implemente o método abaixo, que recebe dois arrays ordenados em forma crescente
    * e retorna um novo array também ordenado em forma crescente.
    */
    public int[] mergeOrdenadosCrescente(int[] a, int[] b) {
        int tamA = a.length;
        int tamB = b.length;
        int[] result = new int[tamA + tamB];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < tamA && j< tamB) {
            if (a[i] <= b[j])
                result[k++] = a[i++];
            else
                result[k++] = b[j++];
        }

        while (i < tamA)
            result[k++] = a[i++];

        while (j < tamB)
            result[k++] = b[j++];

        return result;
    }
    
    /**
    * Implemente o método abaixo, que recebe dois arrays ordenados em forma decrescente
    * e retorna um novo array ordenado em forma crescente.
    */
    public int[] mergeOrdenadosDecrescente(int[] a, int[] b) {
        int tamA = a.length;
        int tamB = b.length;
        int tam = tamA + tamB;
        int[] result = new int[tam];
        
        int i = tamA - 1;
        int j = tamB - 1;
        int k = 0;

        while (i >= 0 && j >= 0) {
            if (a[i] <= b[j])
                result[k++] = a[i--];
            else
                result[k++] = b[j--];
        }

        while (i >= 0)
            result[k++] = a[i--];

        while (j >= 0)
            result[k++] = b[j--];

        return result;
    }
   
    /**
    * Implemente o método abaixo, que recebe dois arrays: a, ordenado em forma crescente e b, ordenado
    * em forma descrescente. Seu método deve retornar um array ordenado em forma crescente.
    */
    public int[] mergeOrdenadosDistintos(int[] a, int[] b) {
        int tamA = a.length;
        int tamB = b.length;
        int[] result = new int[tamA + tamB];

        int i = 0;
        int j = tamB - 1;
        int k = 0;

        while (i < tamA && j >= 0) {
            if (a[i] <= b[j])
                result[k++] = a[i++];
            else
                result[k++] = b[j--];
        }

        while (i < tamA)
            result[k++] = a[i++];
        
        while (j >= 0)
            result[k++] = b[j--];

        return result;
    }
   
    /**
    * Implemente a versão clássica do merge sort que vimos em sala de aula. Você pode
    * criar métodos auxiliares se precisar.
    */
    public void sort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int meio = (ini + fim) / 2;
            sort(v, ini, meio);
            sort(v, meio + 1, fim);
            merge(v, ini, fim);
        }
    }
    
    private void merge(int[] v, int ini, int fim) {
        int tam = fim - ini;
        int[] helper = new int[tam + 1];
        for (int i = 0; i <= tam; i++){
            helper[i] = v[ini + i];
        }

        int meio = tam / 2;

        int i = 0;
        int j = meio + 1;
        int k = ini;

        while (i <= meio && j <= tam) {
            if (helper[i] <= helper[j])
                v[k++] = helper[i++];
            else
                v[k++] = helper[j++];
        }

        while (i <= meio)
            v[k++] = helper[i++];
    }
}
