package StringDemo;

public class SplitDemo3 {

    public static void main(String[] args) {
        String str ="We are learning the Java Language";

        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length;i++) {

            String temp = stArr[i];
            int l = temp.length();

            if ( temp.charAt(l-1)=='e' )
              System.out.println(stArr[i]);
        }
    }
}
