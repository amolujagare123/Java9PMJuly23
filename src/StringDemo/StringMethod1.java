package StringDemo;

public class StringMethod1 {

    public static void main(String[] args) {

        String str = "this is a text";

    /*    System.out.println( str.endsWith("text") );
        System.out.println( str.startsWith("this") );
        System.out.println( str.startsWith("amo") );
        System.out.println( str.contains("is") );
        System.out.println( str.contains("man") );*/

        String checkString = "man";
        String operation = "contains";

        switch (operation)
        {
            case "endsWith" :
                if(str.endsWith(checkString))
                    System.out.printf("Given string ends with:"+checkString);
                else
                      System.out.printf("Given string does not ends with:"+checkString);
                break;
            case "startsWith" :
                if(str.startsWith(checkString))
                    System.out.printf("Given string starts with:"+checkString);
                else
                    System.out.printf("Given string does not starts with:"+checkString);
                break;
            case "contains" :
                if(str.contains(checkString))
                    System.out.printf("Given string contains:"+checkString);
                else
                    System.out.printf("Given string does not contains:"+checkString);
                break;
        }



    }
}
