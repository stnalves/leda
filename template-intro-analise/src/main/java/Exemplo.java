import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Exemplo {

    public static void main(String[] args) {

        // lendo da entrada padrão
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            // Cabeçalho
            System.out.println("alg time sample");
            
            long soma = 0;
            int contador = 0;
            int tamanhoAtual = -1;

	        while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
               
                // medindo tempo de execução 
                long start = System.nanoTime();
       		
		        //comparaExtremos(tokens);
                //indexOf(tokens, "asnoemijr");
                //compareDuplicateFor(tokens);
                compareDuplicateSet(tokens);

                long end = System.nanoTime();
                long time = end - start;

		        int tamanho = tokens.length;

                if (tamanho != tamanhoAtual) {
                    soma = 0;
                    contador = 0;
                    tamanhoAtual = tamanho;
                }

                soma += time;
                contador++;

                if (contador == 30) {
                    long media = soma / 30;
                    //System.out.println("compareDuplicateFor " + (media) + " " + tamanho);
                    System.out.println("compareDuplicateSet " + (time) + " " + tokens.length);

                    soma = 0;
                    contador = 0;
                }

                // saída padrão: método tempo tamanho_da_entrada
		        //System.out.println("comparaExtremos " + (time) + " " + tokens.length);
                //System.out.println("indexOf " + (time) + " " + tokens.length);
                //System.out.println("compareDuplicateFor " + (time) + " " + tokens.length);
                //System.out.println("compareDuplicateSet " + (time) + " " + tokens.length);
            }
        } catch (IOException ioe) {}
    }


	public static boolean comparaExtremos(String[] tokens) {
        	return tokens[0].equals(tokens[tokens.length - 1]);
    	}

    	public static int indexOf(String[] tokens, String key) {
        	for (int i = 0; i < tokens.length; i++) {
            		if (tokens[i].equals(key)) return i;
        	}
        	return -1;
    	}

    	public static boolean compareDuplicateFor(String[] tokens) {
        	for (int i = 0; i < tokens.length; i++) {
            		for (int j = i + 1; j < tokens.length; j++) {
                		if (tokens[i].equals(tokens[j])) return true;
            		}
        	}
        	return false;
    	}

    	public static boolean compareDuplicateSet(String[] tokens) {
        	Set<String> hs = new HashSet<>();
        	for (String token: tokens) {
            	if (hs.contains(token)) {
                	return true;
            	}
            	hs.add(token);
        	}
        return false;
    }
}
