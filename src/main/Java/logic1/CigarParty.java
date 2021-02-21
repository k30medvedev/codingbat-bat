package logic1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {

        if (!isWeekend)
        return cigars >= 40 & cigars <= 60;

        if (isWeekend)
        return  cigars >= 40;
        else return false;
    }

}
