public class Strings {
    public static void main(String[] args) {

        String a = "Kanish";
        String b = "Kanish";

        System.out.println(a == b); // true
        // a == b (==)
            // checks if reference variables are pointing to same object

        // then how to make two refrence variables pointing to different object with same values
        String str1 = "Kanish";
        String str2 = new String("Kanish");

        System.out.println(str1.equals(str2)); // false // For checking only values
        System.out.println(str1.charAt(0)); // K
    }

    // String Pool == Seperate memory structure inside the heap
        // Makes our program more optimised
        // Two string reference var points to same string
        // a = "Kanish" and b = "Kanish"
        // but changing the value for a will not result in change of b

    // Immutability
        // Strings are immutable = we cannot change them for security reasons
        // String a = "Kanish" and a = "Bodhwani"
        // Its not changing rather creating a new object in heap


}
