package Inheritance.Polymorphism;

public class Addition {
    int a;
    int b;
    void addition()
    {
        int c;
        c = a + b;
        System.out.println("Addition="+c);
    }

    void addition(int x)
    {
        int c;
        c = x + 45;
        System.out.println("Addition="+c);
    }

    void addition(int x,int y)
    {
        int c;
        c = x + y;
        System.out.println("Addition="+c);
    }

    void addition(double x,double y)
    {
        double c;
        c = x + y;
        System.out.println("Addition="+c);
    }
    void addition(int x,int y , int z)
    {
        int c;
        c = x + y + z;
        System.out.println("Addition="+c);
    }

    /*int addition(int x,int y , int z)
    {
        int c;
        c = x + y + z;
        System.out.println("Addition="+c);
        return c;
    }*/
    void addition(String x,String y)
    {
        String c;
        c = x + y;
        System.out.println("Addition="+c);
    }
    public static void main(String[] args) {

        Addition ob = new Addition();
       /* ob.a = 10;
        ob.b = 34;*/
        ob.addition();
        ob.addition(67);
        ob.addition(67,11);
        ob.addition(67,11,22);
        ob.addition(67.56,11.67);
        ob.addition("Java+","Selenium");

    }
}
