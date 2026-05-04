import java.io.*;

class Solucao {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] values = br.readLine().split(" ");
        
        int quant = 0;
        
        for (String value: values) {
            if (value.equals(n)) {
                quant++;
                }
            }
        
        System.out.println(quant);   
        }
    }
