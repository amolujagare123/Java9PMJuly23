package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf1 {


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

            System.out.println(al);

            // remove all elements which have length less than 5
           // al.removeIf(str -> (str.length()<5));
            //remove all elements whose second char is 'a'
            al.removeIf(str -> str.charAt(1)=='a');


            System.out.println(al);



    }
}
