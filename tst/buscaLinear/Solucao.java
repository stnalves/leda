import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = transform(sc.nextLine().split(" "));
        int n = sc.nextInt();
        
        System.out.println(buscaLinear(values, n, 0));
    }

    public static int buscaLinear(int[] v, int n, int id) {
        if (id >= v.length) return -1;

        if (v[id] == n) return id;

        return buscaLinear(v, n, id + 1);
    }

    public static int[] transform(String[] v) {
        int[] out = new int[v.length];
        
        for (int i = 0; i < v.length; i++) {
            out[i] = Integer.parseInt(v[i]);
        }

        return out;
    }
}
