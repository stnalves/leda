import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        quickSort(values, 0, values.length - 1);
    }

    public static void quickSort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int idPivot = partition(v, ini, fim);
            
            quickSort(v, ini, idPivot - 1);
            quickSort(v, idPivot + 1, fim);
        }
    }

    public static int partition(int[] v, int ini, int fim) {
        int pivot = v[ini];
        int i = ini;

        for (int j = ini + 1; j <= fim; j++) {
            if (v[j] <= pivot) {
                i++;
                swap(v, i, j);
            }
        }

        swap(v, ini, i);
        printArray(v);
        return i;
    }

    public static void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void printArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);

            if (i < v.length - 1)
                System.out.print(" ");
        }

        System.out.println();
    }
}
