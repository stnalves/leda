import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = transform(sc.nextLine().split(" "));
    
        for (int i = 0; i < values.length - 1; i++) {
            int idMenor = i;

            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[idMenor]) {
                    idMenor = j;
                }
            }

            if (idMenor != i) { 
                int aux = values[i];
                values[i] = values[idMenor];
                values[idMenor] = aux;

                System.out.println(Arrays.toString(values));
            }
        }
    }

    public static int[] transform(String[] v) {
        int[] out = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            out[i] = Integer.parseInt(v[i]);
        }
        return out;
    }
}
