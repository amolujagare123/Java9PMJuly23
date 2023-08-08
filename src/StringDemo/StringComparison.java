package StringDemo;

public class StringComparison {
    public static void main(String[] args) {

        String str1 = "jay";
        String str2 = "jay";
        String str3 = "Jay";
        String str4 = "amol";
        String str5 = new String("jay");

        // str1 == str2
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str4); // false
        System.out.println(str1 == str5); // false
        System.out.println(str1 == str3); // false


    }
}
