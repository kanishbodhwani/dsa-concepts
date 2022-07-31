public class StringsandStringBuilder {
    public static void main(String[] args) {
//        toString class

//        System.out.println(56);
        // It is calling the toString method -- like

//        Integer num = new Integer(56);
//        System.out.println(num.toString());

         // new keyword intializes the new object == Make memory in heap during runtime


//        STRING COMPARISION

//        String name1 = new String("Kanish");
//        String name2 = new String("Kanish");
//
//
//        String a = "Kanish";
//        String b = "Kanish";
//        String c = a;
//        System.out.println(b == a);
//
//        System.out.println(name1 == name2);



        // Pretty Printing
//        float a = 435.65437f;
//        System.out.printf("Formatted string will be %.2f", a);
//
//        System.out.printf("PI: %.4f", Math.PI);
//        System.out.printf("Hello %s and %s", "Kannu", "Kanish");


        // String concatenation
//        System.out.println('a' + 'b');
//        System.out.println("a" + "b");
//        System.out.println((char)('a' + 3)); // d
//        System.out.println("a" + 1);
        // the integer will be converted to integer wrapper class that will call toString()

        // + operator only works for primitives and strings ( Overloaded for String )


        // String Performance
//        String series = "";
//        for(int i = 0; i < 26; i++) {
//            char ch = (char) ('a' + i);
//            series += ch;
//        }
//
//        System.out.println(series);

        // String builder
        StringBuilder builder = new StringBuilder("");
        for(int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
        System.out.println(builder.reverse());


    }
}
