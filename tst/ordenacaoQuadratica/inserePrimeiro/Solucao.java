import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = transform(sc.nextLine().split(" "));

        int i = 0;
        while (i < values.length - 1 && values[i] > values[i + 1]) {
            int aux = values[i];
            values[i] = values[i + 1];
            values[i + 1] = aux;
            i++;
        }

        System.out.println(Arrays.toString(values));
    }

    public static int[] transform(String[] v) {
        int[] out = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            out[i] = Integer.parseInt(v[i]);
        }
        return out;
    }
}
