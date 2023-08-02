package ArraysDemo.twoDimentional;

public class StringTwoDArray3 {

    public static void main(String[] args) {


        String[][] strArr = {
                {"abc1","xyz1","pqr1"},
                {"abc2","xyz2","pqr2"},
                {"abc3","xyz3","pqr3"},
                {"abc4","xyz4","pqr4"},
                {"abc5","xyz5","pqr5"},
        };


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
