import java.io.*;

class Solucao {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        
        int result = findNeg(values, 0);

        System.out.println(result == 0 ? "-" : result);
        }

    public static int findNeg(String[] values, int index) {
        if (index == values.length) {
            return 0;
            }

        int num = Integer.parseInt(values[index]);

        if (num < 0) {
            return num;
            }

        return findNeg(values, index+1);
        }
    }
