package logic2;

public class Blackjack {

    public int blackjack(int a, int b) {

        int one = check21(a);
        int two = check21(b);

        return Math.max(one, two);

    }


    public int check21(int n) {
        if (n > 21)
            return 0;
        else return n;
    }
}


