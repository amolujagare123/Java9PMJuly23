package ArraysDemo.twoDimentional;

public class TwoDIntArray {

    public static void main(String[] args) {
        int[][] a=new int[5][3]; // row x col

        a[0][0] = 11;
        a[0][1] = 21;
        a[0][2] = 31;

        a[1][0] = 41;
        a[1][1] = 51;
        a[1][2] = 61;

        a[2][0] = 71;
        a[2][1] = 81;
        a[2][2] = 91;

        a[3][0] = 72;
        a[3][1] = 83;
        a[3][2] = 94;

        a[4][0] = 75;
        a[4][1] = 86;
        a[4][2] = 97;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i =0 ; i<5 ; i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
