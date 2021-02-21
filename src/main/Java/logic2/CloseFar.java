package logic2;

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {

        int ab = Math.abs(a - b);
        int ba = Math.abs(b - a);
        int ac = Math.abs(a - c);
        int ca = Math.abs(c - a);
        int cb = Math.abs(c - b);
        int bc = Math.abs(b - c);


        if ((ac == 1) & (ba >= 2)&(bc >= 2))
        {
            return true;
        }

        if ((ab <= 1) & (ac >= 2)&(bc >= 2))
        {
            return true;
        }

        if ((ac == 1) & (ab >= 2) & (cb >= 2)) {
            return true;
        }

        if ((ab == 1) & (ca >= 2) & (cb >= 2)) {
            return true;
        }

        if ((ca == 1) & (ba >= 2) & (bc >= 2)) {
            return true;
        }

        if ((ba == 1) & (cb >= 2) & (ca >= 2)) {
            return true;

        }
        else return false;
    }
}
