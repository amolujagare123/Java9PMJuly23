package Inheritance;

public class Animal {
    void eat()
    {
        System.out.println("eat");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("bark");
    }
}

class BabyDog extends Dog
{
    void weeps()
    {
        System.out.println("weeps");
    }
}

class TestMultilevelInheritance
{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

        BabyDog bd = new BabyDog();
        bd.weeps();
        bd.bark();
        bd.eat();
    }
}
