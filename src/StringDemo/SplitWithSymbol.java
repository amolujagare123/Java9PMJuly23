package StringDemo;

public class SplitWithSymbol {

    public static void main(String[] args) {

        String str = "color=red";

        // print the color value
       /* String[] stArr = str.split("=");

        System.out.println("color value:"+stArr[1]);*/

        System.out.println("color value:"+str.split("=")[1]);



    }
}
