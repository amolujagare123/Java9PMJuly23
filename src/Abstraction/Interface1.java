package Abstraction;

public interface Interface1 {
    void start();
    void run();
    void display();
}
interface Interface2 {
    void display();
}

class ChildInterface2 implements Interface1,Interface2
{


    public void start() {
        System.out.println("start");
    }

    public void run() {
        System.out.println("run");
    }
    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {
        ChildInterface2 ob = new ChildInterface2();
        ob.display();


        Interface1 interface1 = new ChildInterface2();
        interface1.display();

        Interface2 interface2 = new ChildInterface2();
        interface2.display();




    }
}
