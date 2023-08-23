package StaticNFinal.StaticDemo;

public class StudentInfo {
    int rno;
    String name;
    static String college="ITC";
    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    static void staticMethod1()
    {
        System.out.println("staticMethod1");

      //  System.out.println("rno="+rno);// non-static - not allowed
    //    System.out.println("name="+name);//  non-static - not allowed
        System.out.println("college="+college);// static - allowed
        staticMethod2();// static - allowed
     //   nonStaticMethod(); //  non-static - not allowed
    }

    static void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
    }

    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo();
        StudentInfo s3 = new StudentInfo();

        s1.staticMethod1();
        s1.staticMethod2();

        StudentInfo.staticMethod1();
        StudentInfo.staticMethod2();

    }
}
