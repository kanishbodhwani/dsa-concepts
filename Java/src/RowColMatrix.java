import java.util.Arrays;
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,39,49},
                {31,33,43,53}
        };
        int target = 31;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return new int[] {row, col};
            }
            if(matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
