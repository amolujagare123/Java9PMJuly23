package StringDemo;

public class SplitWithSymbol5 {

    public static void main(String[] args) {

        String str = "Check A1234Mol wh1234ere is the ra1234ck";


        String[] stArr = str.split("1234");


        for (int i=0;i< stArr.length ;i++)
        {
            System.out.println(stArr[i]);
        }



    }
}
