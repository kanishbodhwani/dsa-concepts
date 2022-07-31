public class Rec {
    public static void main(String[] args) {
        func(5);
    }

    static void func(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
//        func(n--);
//        stack overflow == only print 5

        func(--n);
    }





}
