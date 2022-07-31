public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,10,23,45,67,90,100, 200, 230};
        int target = 23;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        int start = arr[0];
        int end = arr.length - 1;



        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] < target) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }


    // Order Agnostic Binary Search
    static int orderAgnosticBS(int[] arr, int target) {
        int start = arr[0];
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
