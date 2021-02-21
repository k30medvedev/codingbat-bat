package logic1;

public class GreenTicket {
    public int greenTicket(int a, int b, int c) {

        if (a==b & b==c)
            return 20;

        if (a==b & a!=c)
            return 10;
        if(b==c & b!=a)
            return 10;
        if (c==a & c!=b)
            return 10;

        else return 0;

    }

}
