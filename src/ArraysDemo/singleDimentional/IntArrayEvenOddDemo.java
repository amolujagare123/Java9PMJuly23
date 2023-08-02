package ArraysDemo.singleDimentional;

public class IntArrayEvenOddDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 13;
        a[1] = 11;
        a[2] = 9;
        a[3] = 21;
        a[4] = 72;

        int l = a.length;

        for (int i =0; i<a.length ; i++)
        {
            if(a[i] %2 == 0 )
              System.out.println(a[i]+ " even");
            else
                System.out.println(a[i]+ " odd");
        }

    }
}
