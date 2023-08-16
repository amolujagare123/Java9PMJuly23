package basics;

import java.util.Scanner;

public class AreaOfRectangle2 {

    public static void main(String[] args) {
        double l ;
        double b ;

        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length = ");
        l = sc.nextDouble();
        System.out.println("Enter Breadth = ");
        b = sc.nextDouble();


        area = l * b;

        System.out.println("area="+area);

    }
}
