package loops;

public class decrement {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i); // 8
        System.out.println(i); // 8

   /*     i ++ / i - -  : post operators →  here first the statement
                         is executed then increment/decrement happens
        ++ i / - - i  : pre operators  →  here first the increment/decrement
                        happens then statement is executed
*/


    }
}
