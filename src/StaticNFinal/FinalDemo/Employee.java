package StaticNFinal.FinalDemo;

public /*final*/ class Employee {
    int salary=20000;
    /*final*/ void work()
    {
        System.out.println("=== empWork ===");
        System.out.println("Punch");
        System.out.println("work");
    }
}

class Programmer extends Employee
{
    int bonus = 6000;
    void work()
    {
        System.out.println("=== programmerWork ===");
        System.out.println("Punch");
        System.out.println("Code");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("bonus="+p.bonus);
   //     p.programmerWork();

        System.out.println(p.salary);
     //   p.empWork();
        /*Employee e = new Employee();
        System.out.println(e.salary);
        e.empWork();*/
    }
}
