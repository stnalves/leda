import java.io.*;

class Solucao {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        int max = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            int size = generator(i);
            if (size > max) {
                max = size;
                }
            }
        System.out.println(max);   
    }

    public static int generator(int value) {
        int seq = 1;

        while(value > 1) {
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = value * 3 + 1;
            }
            seq++;
        }
        
        return seq;
    }
}
