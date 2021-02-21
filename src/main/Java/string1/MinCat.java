package string1;

public class MinCat {
    public String minCat(String a, String b) {

        if (a.length() > b.length()) {
            int size = b.length();
            return new String(a.substring(a.length()-size)+b);
        }
        if (a.length() < b.length()) {
            int size = a.length();
            return new String(a+b.substring(b.length()-size));
        }

        else return a+b;

    }


}
