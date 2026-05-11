import java.io.*;

class Solucao {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] values = line.split(" ");
                
        System.out.println(compare(values) ? "true" : "false");               
    }

    public static boolean compare(String[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
               if (values[i].equals(values[j])) {
                   return true;
               }
            }
         } 

        return false;
    }
}
