package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {


        public static void main(String[] args) {

            ArrayList<Integer> al = new ArrayList<>();

            al.add(45);
            al.add(25);
            al.add(42);
            al.add(35);
            al.add(67);
            al.add(90);

            System.out.println("al="+al);

            // remove the even elements

            al.removeIf(i -> (i%2==0));
            System.out.println("al="+al);









        }
}
