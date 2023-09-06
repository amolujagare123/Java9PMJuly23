package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveChar {


        public static void main(String[] args) {

            ArrayList<Character> al = new ArrayList<>();

            al.add('a');
            al.add('b');
            al.add('c');
            al.add('d');
            al.add('e');
            al.add('f');
            al.add('g');
            al.add('h');
            al.add('i');
            al.add('j');
            al.add('k');
            al.add('l');
            al.add('m');
            al.add('n');
            al.add('o');
            al.add('p');

            System.out.println(al);

            ArrayList<Character> al2 = new ArrayList<>(){{
                add('a');
                add('e');
                add('i');
                add('o');
                add('u');

            }};

            al.removeAll(al2);


            System.out.println(al);






        }
}
