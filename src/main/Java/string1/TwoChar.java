package string1;

public class TwoChar {
    public static String twoChar(String str, int index) {

        if (index < 0) {
             return new String(str.substring(0, 2));
        } else if (index < str.length() - 1) {
            return new String(str.substring(index, index + 2));
        } else {
            return new String(str.substring(0, 2));
        }
    }

    public static void main(String[] args) {


        String s = twoChar("Hello", 99);
        System.out.println(s);
    }


}
