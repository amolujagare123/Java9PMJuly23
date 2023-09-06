package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo6 {


        public static void main(String[] args) {

            ArrayList<String> al = new ArrayList<>();

          //  System.out.println(al.isEmpty());// true

            al.add("amol");
            al.add("sana");
            al.add("swapnil");
            al.add("shainitha");
            al.add("Rajshekhar");
            al.add("Pandurang");
            al.add("Jagdhish");
            al.add("Madhuri");

          //  System.out.println(al.isEmpty());// false

            System.out.println(al);

            al.set(5,"abcd1");
            System.out.println(al);

    }
}
