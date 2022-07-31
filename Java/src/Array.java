import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];

//        for(int i = 0; i < array.length; i++) {
//            array[i] = in.nextInt();
//        };

//        for (int j : array) {
//            System.out.println(j);
//        };

//        System.out.println(Arrays.toString(array));

        int[][] arr = new int[3][];

        // Column no fixed
        int[][] arr2 = {
            {1,2,3,4},
            {4,5,6},
            {6,7,8,9}
        };

        for(int row = 0; row < arr2.length; row++) {
            for(int col = 0; col < arr2[row].length; col++) {
                System.out.println(arr2[row][col] + " ");
            }
            System.out.println();
        };
        int[] arr5 = {3,4,5};
        System.out.println(Arrays.toString(arr5));


    }
}
