package warmup1;

public class StartOz {
    public static String startOz(String str) {
    if (str.contains("oz"))
        return "oz";
    else if(str.contains("o"))
        return "o";
    else if (str.contains("z"))
        return "z";
    else return " ";
    }
}
