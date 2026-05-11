import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        int meio = values.length / 2;
        int difI = Math.abs(values[i] - values[meio]);
        int difJ = Math.abs(values[j] - values[meio]);

        if (difI <= difJ)
            System.out.println(i);
        else
            System.out.println(j);
    }
}
