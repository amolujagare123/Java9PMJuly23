package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {


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

            ArrayList<String> al2 = new ArrayList<>();
            al2.add("sample");
            System.out.println("al2="+al2);
            al2.addAll(al);
            System.out.println("al2="+al2);





        }
}
