package logic1;

public class TeaParty {
    public int teaParty(int tea, int candy) {


        int teaCandy = tea / candy;
        int candyTea = candy / tea;

        if ((teaCandy >= 2 | candyTea >= 2) & tea>=5 & candy>=5)
            return 2;

        if (tea < 5 | candy < 5)
            return 0;

        if (tea >= 5 & candy >= 5)
            return 1;

        return 0;
    }

}
