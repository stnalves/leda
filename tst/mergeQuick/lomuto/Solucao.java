import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        partitionLomuto(values);
    }

    public static void partitionLomuto(int[] v) {
        int fim = v.length - 1;
        int pivot = v[fim];
        int i = fim;

        for (int j = fim - 1; j >= 0; j--) {
            if (v[j] > pivot) {
                i--;
                swap(v, i, j);
                System.out.println(Arrays.toString(v));
            }
        }
        swap(v, i,  fim);
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(v));
    }

    public static void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
