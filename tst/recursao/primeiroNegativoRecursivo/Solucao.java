import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = transform(sc.nextLine().split(" "));
        
        int res = find(values, 0);

        System.out.println(res < 0 ? res : "-");
    }

    public static int find(int[] v, int id) {
        if (id == v.length) return 0;

        if (v[id] < 0) return v[id];

        return find(v, id + 1);
    }

    public static int[] transform(String[] v) {
        int[] out = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            out[i] = Integer.parseInt(v[i]);
        }
        return out;
    }
}
