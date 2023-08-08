package StringDemo;

public class SplitWithSymbol2 {

    public static void main(String[] args) {

        String str = "12,23,456";


        String[] stArr = str.split(",");

        // {"12","23","456"}

        String temp = "";

        for (int i=0;i< stArr.length ;i++)
        {
            temp = temp +stArr[i];
        }

        System.out.println(temp);



    }
}
