package ClassesNConstructors;

public class MyClassDemoArgument {

    public int a;
    public double d;
    public char c;
    public String str;
    public void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

       /* int x ;
        x = 10 ;*/

        MyClassDemoArgument ob = new MyClassDemoArgument();
        ob.a = 10 ;
        ob.d = 10.45 ;
        ob.c = 'h' ;
        ob.str = "Amol" ;
        ob.display();

        MyClassDemoArgument ob2 = new MyClassDemoArgument();
        ob2.a = 20 ;
        ob2.d = 20.45 ;
        ob2.c = 'c' ;
        ob2.str = "Selenium" ;
        ob2.display();
    }
}
