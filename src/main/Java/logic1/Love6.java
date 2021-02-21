package logic1;

public class Love6 {
    public static boolean love6(int a, int b) {

        int plus = a+b;
        int minus = a-b;
        int minusb = b-a;
        int modul = Math.abs(a)+Math.abs(b);
        int modul2 = Math.abs(a)-Math.abs(b);

        if ( Math.abs(plus) == 6 | Math.abs(minus)==6 | Math.abs(minusb)==6| modul==6
        | modul2==6)
            return true;
        if (a==6 | b==6)
            return true;

        else return false;

    }

    public static void main(String[] args) {

      boolean b = love6(-7,1);
        System.out.println(b);


    }
}
