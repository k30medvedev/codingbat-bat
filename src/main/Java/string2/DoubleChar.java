package string2;

public class DoubleChar {
    public String doubleChar(String str) {

        StringBuilder string = null;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(1 + 1))
                string.append(str.charAt(i) + str.charAt(i));
            else string.append(str.charAt(i));
        }
        return string.toString();
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
