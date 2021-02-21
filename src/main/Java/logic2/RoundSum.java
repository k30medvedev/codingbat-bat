package logic2;

public class RoundSum {
    public int roundSum(int a, int b, int c) {

        a = round10(a);
        b = round10(b);
        c = round10(c);
        return a + b + c;
    }

    public int round10(int num) {
        int mod = num % 10;
        if (mod == 0)
            return num;
        if (mod >= 5)
            return num + (10 - mod);
        else return num - mod;

    }
}

