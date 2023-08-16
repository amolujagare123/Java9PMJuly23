package Inheritance;


class Society
{
    int maintainace = 1000;

    Society()
    {
        System.out.println("Society Constructor");
    }
    Society(int i)
    {
        System.out.println("value="+i);
    }
    void calculateFine()
    {
        int fine = 2000;//2 * maintainace;
        System.out.println(fine);
    }
}

class  Apartment extends Society
{
    Apartment()
    {
        super(56);
        System.out.println("Apartment Constructor");
    }
    int maintainace = 1500;
    void calculateFine()
    {
        int fine = 3000;//2 * maintainace;
        System.out.println(fine);
    }
    void printValues()
    {
        System.out.println("maintainace="+maintainace);
        System.out.println("maintainace="+super.maintainace);
        super.calculateFine();
    }
}

public class SuperDemo {

    public static void main(String[] args) {
        Apartment ap = new Apartment();
       System.out.println(ap.maintainace); //
        ap.printValues();
    }
}
