package Methods;

import ClassesNConstructors.MyClassDemoArgument;

public class MethodParameters {


    void method1(int a)
    {
        System.out.println("my method");
        System.out.println("a="+a);
    }
    void method2(char a)
    {
        System.out.println("my method");
        System.out.println("a="+a);
    }
    void method3(String str)
    {
        System.out.println("my method");
        System.out.println("length of str="+str.length());
    }
    void method4(int a,int b,String str,char c)
    {
        System.out.println("my method");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    void mySingleDimArrayChar(char[] ch)
    {
        for (int i=0;i<ch.length;i++)
            System.out.print(ch[i]+"\t");

        System.out.println();
    }

    void myTwoDimArrayString(String[][] ss)
    {
        for (int i=0;i<ss.length;i++)
        {
            for (int j=0;j<ss[0].length;j++)
            {
                System.out.print(ss[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void mySingleDimArrayInt(int[] x)
    {
        for (int i=0;i<x.length;i++)
            System.out.print(x[i]+"\t");

        System.out.println();
    }

    void setMyObject(MyClassDemoArgument obj)
    {
        obj.a = 56;
        obj.d = 56.7;
        obj.c = 'j';
        obj.str = "my Text";
    }

    public static void main(String[] args) {

        MethodParameters ob = new MethodParameters();
        ob.method1(67);
        ob.method2('f');
        ob.method3("fjdfjdfjkj");
        ob.method4(12,34,"amol",'j');

        char[] myChar = {'j','k','t','u','o','w'};
        int[] myInt= {12,45,67,89,80,12,33,11};

        ob.mySingleDimArrayChar(myChar);
        ob.mySingleDimArrayInt(myInt);

        String[][] stArr = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Eve", "Frank"},
                {"Grace", "Henry", "Ivy"},
                {"Jack", "Kate", "Liam"},
                {"Mia", "Noah", "Olivia"}
        };

        ob.myTwoDimArrayString(stArr);


        MyClassDemoArgument myClassDemoArgument = new MyClassDemoArgument();
        myClassDemoArgument.display();

        ob.setMyObject(myClassDemoArgument);

        myClassDemoArgument.display();
    }
}
