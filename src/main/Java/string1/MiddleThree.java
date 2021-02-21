package string1;

public class MiddleThree {
    public String middleThree(String str) {

        String s1 = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        return s1;
    }

}
