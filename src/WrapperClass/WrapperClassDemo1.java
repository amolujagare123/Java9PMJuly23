package WrapperClass;

public class WrapperClassDemo1 {

    public static void main(String[] args) {

        int i = 10;

        Integer ii = new Integer(23); // boxing or wrapping
        System.out.println("ii="+ii);

        Integer ii2 = 10; // autoboxing or auto wrapping
        System.out.println("ii2="+ii2);
//-------------------------------------------------------------------
        int a = ii.intValue(); // unboxing or unwrapping
        System.out.println("a="+a);

        int a2 = ii; // auto unboxing or auto unwrapping
        System.out.println("a="+a2);


    }
}
