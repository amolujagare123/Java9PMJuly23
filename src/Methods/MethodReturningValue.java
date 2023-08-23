package Methods;

import ClassesNConstructors.MyClassDemoArgument;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodReturningValue {
    int myMethod()
    {
        System.out.println("inside my method");
        int x=10;
        return x;
    }

    char myCharMethod()
    {
        char ch = 'k';
        return ch;
    }


    // write a function which takes a string as an argument
    // and returns the
    // reverse of the string

    String reverseMyString(String myStr)
    {
        String temp= "";

        for (int i=myStr.length()-1;i>=0;i--)
        {
            temp = temp + myStr.charAt(i);
        }

        return temp;
    }

    // given date is in the string with pattern dd/MM/yyyy
    // convert it into Date

    Date convertStringToDate(String dateStr) throws ParseException // dd/MM/yyyy
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
       /* Date date = sd.parse(dateStr);
        return date;*/
        return sd.parse(dateStr);
    }

    MyClassDemoArgument setMyNewObject()
    {
        MyClassDemoArgument obj = new MyClassDemoArgument();
        obj.a = 100;
        obj.d = 111.111;
        obj.c='a';
        obj.str = "java";

        return obj;
    }

    int[] arrayValues()
    {
        int[] arr = {12,23,34,45,56,78,89,90};
        return arr;
    }

    String[][] arrayTwoDValues()
    {
        String[][] stArr = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Eve", "Frank"},
                {"Grace", "Henry", "Ivy"},
                {"Jack", "Kate", "Liam"},
                {"Mia", "Noah", "Olivia"}
        };

        return stArr;
    }


    public static void main(String[] args) throws ParseException {

        int a;
        a = 100;
        System.out.println(a); //100
        int y;
        y = a;

        System.out.println(y); //100

        MethodReturningValue ob = new MethodReturningValue();

        System.out.println("ob.myMethod()="+ob.myMethod());
        int myIntVar = ob.myMethod();
        System.out.println("myIntVar="+myIntVar);

        System.out.println("myCharMethod()="+ob.myCharMethod());
        char myChar = ob.myCharMethod();
        System.out.println("myChar="+myChar);


        String str = "My name is Amol";

        System.out.println(ob.reverseMyString(str));

        System.out.println(ob.convertStringToDate("12/04/2023"));


        MyClassDemoArgument myClassDemoArgument = new MyClassDemoArgument();

        myClassDemoArgument = ob.setMyNewObject();

        myClassDemoArgument.display();


        int[] myArray = ob.arrayValues();
        for (int i=0;i<myArray.length;i++)
            System.out.println(myArray[i]);

        String[][] myStringArray = ob.arrayTwoDValues();

        for (int i=0;i<myStringArray.length;i++)
        {
            for(int j=0;j<myStringArray[0].length;j++)
            {
                System.out.print(myStringArray[i][j]+"\t");
            }
            System.out.println();
        }



    }
}
