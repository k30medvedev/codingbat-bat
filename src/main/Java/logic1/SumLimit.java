package logic1;

public class SumLimit {
    public int sumLimit(int a, int b) {

        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        String summ = String.valueOf(a + b);


        if (summ.length() > aString.length()) {
            return a;

        } else return a + b;

    }

}
