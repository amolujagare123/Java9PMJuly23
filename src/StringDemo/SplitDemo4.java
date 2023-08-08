package StringDemo;

public class SplitDemo4 {

    public static void main(String[] args) {
        String str ="We want to go to Toronto";

        String[] stArr = str.split(" ");
      // print the words whose 2nd character is 'o'
        for (int i=0;i< stArr.length;i++) {

            if(stArr[i].charAt(1) == 'o' )
                System.out.println(stArr[i]);
        }
    }
}
