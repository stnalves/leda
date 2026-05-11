import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        mergeSort(values, 0, values.length - 1);
    }

    public static void mergeSort(int[] v, int ini, int fim) {
        System.out.println(Arrays.toString(Arrays.copyOfRange(v, ini, fim + 1)));
        
        if (ini < fim) {
            int meio = (ini + fim) / 2;
            
            mergeSort(v, ini, meio);
            mergeSort(v, meio + 1, fim);
            
            merge(v, ini, fim);
            
            System.out.println(Arrays.toString(Arrays.copyOfRange(v, ini, fim + 1)));
        }
    }

    public static void merge(int[] v, int ini, int fim) {
        int tam = fim - ini;
        int[] helper = new int[tam + 1];
        for (int i = 0; i <= tam; i++)
            helper[i] = v[ini + i];

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
