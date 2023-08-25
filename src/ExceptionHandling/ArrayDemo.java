package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] =11;
        a[1] =12;
        a[2] =13;
        a[3] =41;
        a[4] =51;
        a[5] =61;

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
