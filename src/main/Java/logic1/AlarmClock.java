package logic1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {

        if (vacation){
            if (day >=1 & day <=5)
                return "10:00";
            if (day ==6 | day ==7)
                return "off";
        }

        if (day >=1 & day <=5)
            return "7:00";
        if (day ==6 | day ==7)
            return "10:00";
    else return "00:00";

    }
}
