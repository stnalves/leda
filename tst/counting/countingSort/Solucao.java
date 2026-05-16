import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();

        int[] b = new int[a.length];
        int[] c = new int[k + 1];

        for (int i = 0; i < a.length; i++) {
            c[a[i]]++;
            printArray(c);
        }
    
        for (int i = 1; i < c.length; i++)
            c[i] += c[i - 1];

        System.out.print("Cumulativa do vetor de contagem - ");
        printArray(c);

        for (int i = a.length - 1; i >= 0; i--) {
            b[c[a[i]] - 1] = a[i];
            c[a[i]]--;
        }

        printArray(c);
        printArray(b);
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
