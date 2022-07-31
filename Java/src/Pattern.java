public class Pattern {
    public static void main(String[] args) {
        pattern8(4);
    }

//    static void pattern2(int n) {
//        for (int row = 1; row <= n; row++) {
//            // for every row, run the col
//            for(int col = 1; col <= row; col++) {
//                System.out.println("* ");
//            }
//            System.out.print("\n");
//        }
//    }

//    static void pattern1(int n) {
//        for (int row = 1; row <= n; row++) {
//            // for every row, run the col
//            for(int col = 1; col <= n; col++) {
//                System.out.println("*");
//            }
//            System.out.print("\n");
//        }
//    }

//    static void pattern3(int n) {
//        for (int row = 1; row <= n; row++) {
//            // for every row, run the col
//            for(int col = 1; col <= n-row + 1; col++) {
//                System.out.println("* ");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern4(int n) {
//        for (int row = 1; row <= 2 * n; row++) {
//            // for every row, run the col
//            int totalColsInRow = row > n ? 2 * n - row : row;
//            for(int col = 0; col < totalColsInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
//    }


//    static void pattern5(int n) {
//        for (int row = 1; row <= 2 * n; row++) {
//            // for every row, run the col
//            int totalColsInRow = row > n ? 2 * n - row : row;
//            int noOfSpaces = n - totalColsInRow;
//            for (int s = 0; s < noOfSpaces; s++) {
//                System.out.print(" ");
//            }
//            for(int col = 0; col < totalColsInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
//    }

//    static void pattern6(int n) {
//        for (int row = 1; row <= n; row++) {
//            // for every row, run the col
//            for (int s = 0; s < n - row; s++) {
//                System.out.print("  ");
//            }
//
//            for (int col = row; col >= 1; col--) {
//                System.out.print(col + " ");
//            }
//            for (int col = 2; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.print("\n");
//        }
//    }

//    static void pattern7(int n) {
//        n = 2 * n;
//        for (int row = 0; row <= n; row++) {
//            for (int col = 0; col <= n; col++) {
//                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n-col));
//                System.out.print(atEveryIndex + " ");
//            }
//            System.out.print("\n");
//        }
//    }

    static void pattern8(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.print("\n");
        }
    }
}
