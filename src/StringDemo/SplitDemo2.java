package StringDemo;

public class SplitDemo2 {

    public static void main(String[] args) {
        String str ="We are learning the Java Language";

        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length;i++) {

            if (stArr[i].endsWith("e"))
              System.out.println(stArr[i]);
        }
    }
}
