package warmup1;

public class Max1020 {
    public static int max1020(int a, int b) {
        if (((a >= 10 & a <= 20) | (b >= 10) & b <= 20))
            if (a>b) return a;
            if (b>a)return b;


        else return 0;
    }

}
