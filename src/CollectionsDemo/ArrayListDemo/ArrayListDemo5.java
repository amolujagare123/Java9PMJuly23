package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {


        public static void main(String[] args) {

            ArrayList<Integer> al = new ArrayList<>();

            al.add(45);
            al.add(25);
            al.add(41);
            al.add(35);
            al.add(67);
            al.add(90);

            System.out.println("al="+al);


           // Integer ii = new Integer(41);

           // al.remove(3);
           // al.remove(41);
          //  al.remove(ii);
            al.remove(new Integer(41));

            System.out.println("al="+al);






        }
}
