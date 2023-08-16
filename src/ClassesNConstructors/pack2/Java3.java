package ClassesNConstructors.pack2;

import ClassesNConstructors.pack1.Java1;

public class Java3 extends Java1 {

    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a = 10 ;
     //   ob.d = 10.45 ;
     //   ob.c = 'h' ;
      // ob.str = "Amol" ;
     //   ob.display();


        Java3 j3 = new Java3();
        j3.a = 10; // public
    //    j3.d = 45.78;
    //    j3.c = 'o';
        j3.str = ""; // protected
    }
}
