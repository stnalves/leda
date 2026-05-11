import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = transform(sc.nextLine().split(" "));
        
        selectionSort(values, values.length, 0);
    }

    public static void selectionSort(int[] values, int n, int i) {
        if (i >= n - 1) return;
        
        int minIndex = i;

        for(int j = i + 1; j < n; j++) {
            if (values[j] < values[minIndex]) {
                minIndex = j;
            }
        }
        
        int aux = values[i];
        values[i] = values[minIndex];
        values[minIndex] = aux;

        System.out.println(Arrays.toString(values));        

        selectionSort(values, n, i + 1);
    }

    public static int[] transform(String[] v) {
        int[] out = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            out[i] = Integer.parseInt(v[i]);
        }
        return out;
    }
}
