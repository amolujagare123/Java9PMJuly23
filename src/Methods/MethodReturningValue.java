package Methods;

public class MethodReturningValue {
    int myMethod()
    {
        System.out.println("inside my method");
        int x=10;
        return x;
    }
    public static void main(String[] args) {

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


    }
}
