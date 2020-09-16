//your package goes here
import java.util.*;
public class ZeroMax {

    public static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i<arr.length; i++) {
            sb.append(arr[i]);
            if(i != arr.length-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }





    public static int[] zeroMax(int[] input) {
        int check = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                for (int j = i; j < input.length; j++) {
                    if (input[j] % 2 != 0) {
                        input[i] = input[j];
                        break;
                    }
                }
            }
        }
    return input;
    }
    public static void main(String[] args) {
        printArray(zeroMax(new int[]{0, 5, 0, 3, 0, 9, 0, 7}));
        printArray(zeroMax(new int[]{0, 4, 0, 3}));
        printArray(zeroMax(new int[]{0, 1, 0}));


	// write your code here


    }
}
