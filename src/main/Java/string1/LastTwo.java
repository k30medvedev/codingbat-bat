package string1;

public class LastTwo {
    public String lastTwo(String str) {

        if (str.length()<2)
            return str;

        char[] chars = str.toCharArray();
        char helper = chars[chars.length - 1];
        char helper2 = chars[chars.length - 2];

        chars[chars.length - 1] = helper2;
        chars[chars.length - 2] = helper;

        String s = new String(chars);

        return s;

    }

}
