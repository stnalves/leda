import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int primeiroElemento = values[0];
        int ordem = 1;

        for (int i = 1; i < values.length; i++) {
            if (values[i] < primeiroElemento)
                ordem++;
        }
        
        System.out.println(ordem);
    }
}
