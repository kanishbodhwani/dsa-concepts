public class Recursion {
    public static void main(String[] args) {
//        int[] arr = {3,5,76,9,100};
//        int target = 67;
//        System.out.println(binarySearch(arr, target, 0, arr.length - 1));

        System.out.println(prodOfDigits(55));

    }

//    static void print (int n) {
//        if(n == 6) {
//            return;
//        }
//
//        System.out.println(n);
//        print(n+1);
//    }
//
//

    // Fibonacci using recursion
    // highly time taking
    // Not optimised
    // Tip: Use memoization
    static int fibo(int n) {
        if(n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    // Binary search using recursion

    static int binarySearch(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if(arr[m] == target) {
            return m;
        }
        if(target < arr[m]) {
            return binarySearch(arr, target, s, m - 1);
        }
        return binarySearch(arr, target, m + 1, e);
    }


    // Factorial
    static int fact(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }


    // sum of numbers

    static int sum(int n) {
        if(n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    static int sumOfDigits(int n) {
        if(n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }


    static int prodOfDigits(int n) {
        if(n%10 == n) {
            return n;
        }

        return n % 10 * prodOfDigits(n / 10);
    }
}
