package ClassesNConstructors;

public class MyClass5 {

    int a;
    double d;
    char c;
    String str;

    MyClass5(int a1 , double d1, char c1,String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClass5 ob = new MyClass5(12,23.67,'h',"Soumya");

        ob.display();


    }
}
