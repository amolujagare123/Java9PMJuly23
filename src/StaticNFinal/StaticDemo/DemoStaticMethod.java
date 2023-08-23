package StaticNFinal.StaticDemo;

import static StaticNFinal.StaticDemo.StudentInfo.staticMethod2;
import static StaticNFinal.StaticDemo.StudentInfo.college;
//import static StaticNFinal.StaticDemo.StudentInfo.staticMethod2;
//import static StaticNFinal.StaticDemo.StudentInfo.college;
//import static StaticNFinal.StaticDemo.StudentInfo.*;
public class DemoStaticMethod {

    static int myVariable=0;

    static void testMethod()
    {

    }
    public static void main(String[] args) {
        StudentInfo ob = new StudentInfo();
      /*  ob.staticMethod1();
        ob.staticMethod2();*/
        myVariable = 1;
        testMethod();


        college ="";
        staticMethod2();
    }
}
