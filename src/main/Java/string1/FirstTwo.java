package string1;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() > 2)
            return new String(str.substring(0, 2));

        else return str;
    }

}
