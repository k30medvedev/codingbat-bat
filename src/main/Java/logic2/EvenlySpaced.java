package logic2;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {

        int res = Math.max(a, b) - Math.min(a, b);
        int res3 = Math.max(b, c) - Math.min(b, c);
        int res2 = Math.max(a, c) - Math.min(a, c);

        if ((a == b) & (a == c))
            return true;

        if ((a == b) | (b == c) | (a == c))
            return false;

        if (res == res2)
            return true;
        if (res == res3)
            return true;
        if (res2 == res3)
            return true;
        else return false;

    }
}
