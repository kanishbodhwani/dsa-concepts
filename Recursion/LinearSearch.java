import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,5,6};
        System.out.println(findAllIndex2(arr, 5, 0));
    }

    static boolean find(int[] arr, int target, int i) {
        if(i == arr.length - 1) {
            return false;
        }

        return arr[i] == target || find(arr, target, i+1);
    }

    static int findIndex(int[] arr, int target, int i) {
        if(i == arr.length) {
            return -1;
        }

        if(target == arr[i]) {
            return i;
        } else {
            return findIndex(arr, target, i + 1);
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndexArray(int[] arr, int target, int i) {
        if(i == arr.length) {
            return;
        }

        if(target == arr[i]) {
            list.add(i);
        }

        findIndexArray(arr, target, i+1);
    }


    static ArrayList findAllIndex(int[] arr, int target, int i, ArrayList<Integer> list) {
        if(i == arr.length) {
            return list;
        }

        if(target == arr[i]) {
            list.add(i);
        }

        return findAllIndex(arr, target, i+1, list);
    }

    static ArrayList findAllIndex2(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length) {
            return list;
        }

        if(target == arr[i]) {
            list.add(i);
        }

        ArrayList ansFromBelowcalls = findAllIndex2(arr, target, i+1);

        list.addAll(ansFromBelowcalls);
        return list;
    }






}
