import java.util.*;

class Solucao {
    public static void main(String[] argrs) {
        Scanner sc = new Scanner(System.in);

        int[] v = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int d = sc.nextInt();

        radix(v, d);
    }

    public static void radix(int[] v, int d) {
        int exp = 1;

        for (int i = 0; i < d; i++){
            countingSort(v, exp);
            System.out.println(Arrays.toString(v));
            exp *= 10;
        }
    }

    public static void countingSort(int[] a, int exp) {
        int[] b = new int[a.length];
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++)
            c[(a[i] / exp) % 10]++;
        
        for (int i = 1; i < c.length; i++)
            c[i] += c[i - 1];

        for (int i = a.length - 1; i >= 0; i--) {
            b[c[(a[i] / exp) % 10] - 1] = a[i];
            c[(a[i] / exp) % 10]--;
        }

        for (int i = 0; i < a.length; i++)
            a[i] = b[i];
    }
}
