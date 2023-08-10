package ClassesNConstructors;

public class MyClass6 {

    int a;
    double d;
    char c;
    String str;

    MyClass6(int a , double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClass6 ob = new MyClass6(12,23.67,'h',"Soumya");

        ob.display();


    }
}
