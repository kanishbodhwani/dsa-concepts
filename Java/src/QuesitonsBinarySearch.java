public class QuesitonsBinarySearch {
    public static void main(String[] args) {
        // Ceiling of a number == In an array find the smallest number that is greater than equal to target element
        // Floor of a number == find the greatest number that is smaller than or equal to target element

        int[] arr = {2,3,5,6,8,10,23,43,45,46};
        int target = 44;
        int ans1 = ceiling(arr, target);
        int ans2 = floor(arr, target);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
