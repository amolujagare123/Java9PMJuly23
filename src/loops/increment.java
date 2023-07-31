package loops;

public class increment {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); // 12
        System.out.println(i); // 12

   /*     i ++ / i - -  : post operators →  here first the statement
                         is executed then increment happens
        ++ i / - - i  : pre operators  →  here first the increment
                        happens then statement is executed
*/


    }
}
