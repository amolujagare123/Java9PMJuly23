package StringDemo;

public class SplitWithSymbol4 {

    public static void main(String[] args) {

        String str = "Prashant and ram are playing back of the rack";


        String[] stArr = str.split("ra");


        for (int i=0;i< stArr.length ;i++)
        {
            System.out.println(stArr[i]);
        }



    }
}
