package ClassesNConstructors;

public class MyClass4 {

    int a;
    double d;
    char c;
    String str;

    MyClass4()
    {
        a = 34;
        d = 34.67;
        c = 'j';
        str = "Jagdish";
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClass4 ob = new MyClass4();
        ob.a =100;

        ob.display();


    }
}
