package logic1;

public class BlueTicket {
    public int blueTicket(int a, int b, int c) {

        int summAB = a+b;
        int summBC = b+c;
        int summAC = a+c;

        if (summAB==10 | summAC==10| summBC==10)
            return 10;

        if (summAB-summBC==10 | summBC-summAB==10 | summAB-summAC==10 | summAC-summAB==10)
            return 5;

        else return 0;

    }

}
