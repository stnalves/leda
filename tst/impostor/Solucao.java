import java.io.*;
import java.util.*;

class Solucao {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int size = values.length;

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(values[i]);
            }
        
        for (int i = 1; i < size; i++) {
            if (nums[i-1] > nums[i]) {
                int impostor = nums[i];
                int j = i - 1;
                
                while (j >= 0 && nums[j] > impostor) {
                    nums[j+1] = nums[j];
                    j--;
                    }
                nums[j + 1] = impostor; 
                break;
                }
            }

        System.out.println(Arrays.toString(nums));
        }
    }
