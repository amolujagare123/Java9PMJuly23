package ExceptionHandling;

public class NumberDemo {

    void checkNumber(int a)  {
        if (a>=1 && a<=10)
            System.out.println("we are safe");
        else
            throw new ArithmeticException("we are in danger");
    }

    public static void main(String[] args) {

        int i = 14;
        NumberDemo ob = new NumberDemo();
        System.out.println("check the number");
        ob.checkNumber(i);
        System.out.println("end of the program");

    }
}
