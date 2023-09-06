package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("amol");
        s.push("sana");
        s.push("swapnil");
        s.push("shainitha");
        s.push("Rajshekhar");
        s.push("Pandurang");
        s.push("Jagdhish");

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);
    }
}
