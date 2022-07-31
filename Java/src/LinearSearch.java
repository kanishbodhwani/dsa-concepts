public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {14,5,6,8,90,45,21};
        int target = 45;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        // exit
        return -1;
    }
}

