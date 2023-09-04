package WrapperClass;

public class WrapperClassDemo2 {

    public static void main(String[] args) {

        String str1 = "11";
        String str2 = "22";

        System.out.println(str1+str2);

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        System.out.println(i1+i2);

        String str3 = "23.67";
        String str4 = "22.11";

        System.out.println(str3+str4);

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);
        System.out.println(d1+d2);

        float f1 = Float.parseFloat(str3);
        float f2 = Float.parseFloat(str4);
        System.out.println(f1+f2);

        String str5 = "false";
        boolean b = Boolean.parseBoolean(str5);

        if (b)
            System.out.println("this is a true value");
        else
            System.out.println("this is a false value");

        String str6 = "g";
        char ch = str6.charAt(0);
        System.out.println("ch="+ch);
    }
}
