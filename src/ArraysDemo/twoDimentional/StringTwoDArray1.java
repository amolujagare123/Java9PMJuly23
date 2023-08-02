package ArraysDemo.twoDimentional;

public class StringTwoDArray1 {

    public static void main(String[] args) {


        String[][] strArr = new String[4][3];

        strArr[0][0] = "Alice";
        strArr[0][1] = "Bob";
        strArr[0][2] = "Charlie";

        strArr[1][0] = "David";
        strArr[1][1] = "Eve";
        strArr[1][2] = "Frank";

        strArr[2][0] = "Grace";
        strArr[2][1] = "Hank";
        strArr[2][2] = "Isabelle";

        strArr[3][0] = "Jack";
        strArr[3][1] = "Katherine";
        strArr[3][2] = "Liam";

        for (int i=0;i< strArr.length;i++)
        {
            for (int j=0;j< strArr[0].length ;j++ )
            {
                System.out.print(strArr[i][j]+"\t\t");
            }
            System.out.println();
        }


    }
}
