package logic1;

public class DateFashion {
    public int dateFashion(int you, int date) {
        if (you <=2 | date <=2)
            return 0;

        if (you>=8 & date > 2)
            return 2;

        if (date>=8 & you > 2)
            return 2;

        else return 1;
    }

}
