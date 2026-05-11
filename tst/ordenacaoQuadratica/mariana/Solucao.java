import java.util.*;

class Solucao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(",");
        
        System.out.println(format(names));
        insertionSort(names);
    }

    public static void insertionSort(String[] names) {
        for (int i = 1; i < names.length; i++) {
            int j = i;

            while (j > 0 && names[j].compareTo(names[j - 1]) < 0) {
                String aux = names[j];
                names[j] = names[j - 1];
                names[j - 1] = aux;
                j--;
            }
            
            System.out.println(format(names));
        }
    }

    public static String format(String[] names) {
        String out = "";
        for (int i = 0; i < names.length; i++) {
            out += names[i];
            if (i < names.length - 1) {
                out += ", ";
            }
        }

        return out;
    }
}
