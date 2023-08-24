package Abstraction;

public interface MyInterface {
    void start();
    void run();
    static void display1()
    {
        System.out.println("display1");
    }
    default void display2()
    {
        System.out.println("display2");
    }
    private void display3()
    {
        System.out.println("display3");
    }

}

class ChildInterface implements MyInterface
{
    public void run()
    {
        System.out.println("run");
    }
    public void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        MyInterface ob = new ChildInterface();
        ob.run();
        ob.start();
        ob.display2();
        MyInterface.display1();
        //ob.display3();

    }

}
