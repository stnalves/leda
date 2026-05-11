import java.io.*;
import java.util.*;

class Solucao{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        
        for (int i = 0; i < values.length - 1; i+=2) {
            String aux = values[i];
            values[i] = values[i+1];
            values[i+1] = aux;
            }

        System.out.println(Arrays.toString(values));
        }
    
    }
