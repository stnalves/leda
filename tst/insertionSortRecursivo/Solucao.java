import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] values = transform(sc.nextLine().split(" "));
        insertionSort(values, 1);
    }
    
    public static void insertionSort(int[] v, int i) {
        if (i >= v.length) return;

        int j = i;

        while (j > 0 && v[j] < v[j - 1]) {
            int aux = v[j];
            v[j] = v[j - 1];
            v[j - 1] = aux;
            j--;
        }
        
        System.out.println(Arrays.toString(v));
        insertionSort(v, i + 1);
    }

    public static int[] transform(String[] v) {
        int[] out = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            out[i] = Integer.parseInt(v[i]);
        }
        return out;
    }
}
