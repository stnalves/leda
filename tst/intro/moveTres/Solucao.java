import java.io.*;
import java.util.*;

class Solucao {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");

        int[] nums = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            nums[i] = Integer.parseInt(values[i]);
            }
        
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                start = i;
                break;}
            }

        for (int i = 0; i < 3; i++) {
            int k = start + i;
            int num = nums[k];
            int j = k - 1;

            while (j >= 0 && nums[j] > num){
                nums[j+1] = nums[j];
                nums[j] = num;
                j--;
                System.out.println(Arrays.toString(nums));
                }
            }
        }
    }
