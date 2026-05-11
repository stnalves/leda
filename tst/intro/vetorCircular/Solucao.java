import java.io.*;

class Solucao {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
    
        String[] out = new String[n];

        for (int i = 0; i < n; i++) {
            out[i] = values[i%values.length];
            }

        System.out.println(String.join(" ", out));
        }
    }
