import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();
        int menor = sc.nextInt();
        
        int[] b = new int[a.length];
        int[] c = new int[k + Math.abs(menor) +  1];

        for (int i = 0; i < a.length; i++) {
            c[a[i] + Math.abs(menor)]++;
            System.out.println(Arrays.toString(c));
        }

        for (int i = 1; i < c.length; i++)
            c[i] += c[i - 1];

        System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(c));

        for(int i = a.length - 1; i >= 0; i--) {
            b[c[a[i] + Math.abs(menor)] - 1] = a[i];
            c[a[i] + Math.abs(menor)]--;
        }

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(b));
    }
}
