package warmup1;

public class Weekday {
    public boolean sleepIn(boolean weekday, boolean vacation) {
    if((!weekday) & (!vacation))
        return true;
    else if ((!weekday) & (vacation))
        return true;
    else if ((weekday) & (vacation))
        return true;
    else return false;


    }
}
