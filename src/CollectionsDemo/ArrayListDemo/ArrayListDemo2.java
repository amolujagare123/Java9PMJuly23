package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {


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
            System.out.println(al.get(3));
            System.out.println("size="+al.size());

            System.out.println("==== Using for loop ====");
            for (int i=0;i<al.size();i++)
                System.out.println(al.get(i));

            System.out.println("==== Using for each loop ====");
            for(String str:al)
                System.out.println(str);

            System.out.println("==== Using Iterator ====");

            Iterator itr = al.iterator();
            while (itr.hasNext())
                System.out.println(itr.next());



        }
}
