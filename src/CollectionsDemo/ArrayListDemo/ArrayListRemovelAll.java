package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemovelAll {


        public static void main(String[] args) {

            ArrayList<Integer> al = new ArrayList<>();

            al.add(45);
            al.add(25);
            al.add(41);
            al.add(35);
            al.add(67);
            al.add(90);

            System.out.println("al="+al);

            ArrayList<Integer> al2 = new ArrayList<>();

            al2.add(45);
            al2.add(25);
            al2.add(41);
            al2.add(11);
            al2.add(21);
            al2.add(31);
            al2.add(51);
            al2.add(61);
            al2.add(71);
            System.out.println("al2="+al2);

            al2.removeAll(al);
            System.out.println("al2="+al2);

            al2.clear();
            System.out.println("al2="+al2);












        }
}
