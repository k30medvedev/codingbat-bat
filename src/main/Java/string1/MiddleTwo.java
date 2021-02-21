package string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        String s1 = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        return s1;
    }
}
