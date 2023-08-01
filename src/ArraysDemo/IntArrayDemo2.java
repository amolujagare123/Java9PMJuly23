package ArraysDemo;

public class IntArrayDemo2 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 13;
        a[1] = 11;
        a[2] = 9;
        a[3] = 21;
        a[4] = 72;

        /*for (int i =0; i<5 ; i++)
        {
            System.out.println(a[i]);
        }*/
        for(int x:a) // for each loop
        {
            System.out.println(x);
        }

    }
}
