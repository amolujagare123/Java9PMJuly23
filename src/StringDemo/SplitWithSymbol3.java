package StringDemo;

public class SplitWithSymbol3 {

    public static void main(String[] args) {

        String str = "this tragedy is only his problem";


        String[] stArr = str.split("is");


        for (int i=0;i< stArr.length ;i++)
        {
            System.out.println(stArr[i]);
        }



    }
}
