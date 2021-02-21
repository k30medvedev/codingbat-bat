package warmup1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        if (s2.endsWith(s1))
            return true;
        if (s1.endsWith(s2))
            return true;
        else return false;
    }
}
