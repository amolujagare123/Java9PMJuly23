package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {


        public static void main(String[] args) {

            ArrayList<String> al = new ArrayList<>();

            al.add("amol");
            al.add("sana");
            al.add("swapnil");
            al.add("shainitha");
            al.add("Rajshekhar");
            al.add("Pandurang");
            al.add("Jagdhish");
            al.add("Madhuri");

            System.out.println("al="+al);

         //   al.remove("Rajshekhar");
            al.remove(5);

            System.out.println("al="+al);






        }
}
