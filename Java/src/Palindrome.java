public class Palindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(121);
        System.out.println(ans);
    }

    static boolean isPalindrome(int x) {
        String num = "";
        int a = x;
        while(x > 0) {
            num += Integer.toString(x % 10);
            x /= 10;
        }
        return Integer.parseInt(num) == a;
    }
}
