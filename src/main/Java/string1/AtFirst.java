package string1;

public class AtFirst {
    public String atFirst(String str) {

        String s = str.substring(0);
        String s2 = "@";
        if (str.length() == 0)
            return new String(s2 + s2);
        else if (str.length() < 2)
            return new String(s + s2);
        else return new String(str.substring(0, 2));
    }

}
