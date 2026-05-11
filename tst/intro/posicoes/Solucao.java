import java.io.*;
import java.util.*;

class Solucao {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] values = br.readLine().split(" ");

        List<String> pos = new ArrayList<>();
        
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(n)) {
                pos.add(String.valueOf(i));
            }
        }

        if (pos.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(String.join(" ", pos));
            }
        }
    }
