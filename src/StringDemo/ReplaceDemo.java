package StringDemo;

public class ReplaceDemo {

    public static void main(String[] args) {

        String str = "12,23,456";

        String newString = str.replace(",","");

        System.out.println(newString);

        // 1223456 -- > String

        int num = Integer.parseInt(newString);
        System.out.println(num);
        System.out.println(num - 1);



    }
}
