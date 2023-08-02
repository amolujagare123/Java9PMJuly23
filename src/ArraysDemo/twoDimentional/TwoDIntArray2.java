package ArraysDemo.twoDimentional;

public class TwoDIntArray2 {

    public static void main(String[] args) {

        int[] a0 = {11,21,31}; // 3 --> a0.length --> 3
        int[] a1 = {41,51,61}; // 3
        int[] a2 = {71,81,91};// 3
        int[] a3 = {72,83,94};// 3
        int[] a4 = {75,86,97};// 3

        int[][] a2D = {a0,a1,a2,a3,a4};


        int[][] a= {

                {11,21,31} ,
                {41,51,61} ,
                {71,81,91},
                {72,83,94},
                {75,86,97}
        };



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
