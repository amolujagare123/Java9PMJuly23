package Abstraction;

public abstract class AbstractClassDemo {

    abstract void run();
    abstract void start();

    void myDisplayMethod()
    {
        System.out.println("myDisplayMethod");
    }
}

class ChildAbstract extends AbstractClassDemo
{
   /* @Override
    void run() {

    }

    @Override
    void start() {

    }*/
   void run()
    {
        System.out.println("run");
    }
    void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {
        AbstractClassDemo ob = new ChildAbstract(); // upcasting
        ob.run();
        ob.start();
        ob.myDisplayMethod();
    }
}
