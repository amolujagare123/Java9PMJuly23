package StaticNFinal.FinalDemo;

public final class FinalVariableDemo {
    final int speed = 100;
    int i;
    void change()
    {
        i = 100;
     //   speed = 200;
    }
    public static void main(String[] args) {
        FinalVariableDemo ob = new FinalVariableDemo();
        ob.change();
        System.out.println(ob.speed);
    }
}
