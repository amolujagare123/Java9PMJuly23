package StringDemo;

public class EndsWithDemo {

    public static void main(String[] args) {

        String str = "this is a text";

        System.out.println( str.endsWith("text") );

        System.out.println( str.startsWith("this") );
        System.out.println( str.startsWith("amo") );
        System.out.println( str.contains("is") );
        System.out.println( str.contains("man") );


    }
}
