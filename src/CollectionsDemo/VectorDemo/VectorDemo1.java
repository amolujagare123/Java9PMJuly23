package CollectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("Capacity="+v.capacity());
        System.out.println("size="+v.size());

        v.add("amol");
        v.add("sana");
        v.add("swapnil");
        v.add("shainitha");
        v.add("Rajshekhar");
        v.add("Pandurang");
        v.add("Jagdhish");
        v.add("Madhuri");
        v.add("Jagdhish");
        v.add("Madhuri");
        v.add("Madhuri");

        System.out.println("Capacity="+v.capacity());
        System.out.println("size="+v.size());

        System.out.println(v);

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
