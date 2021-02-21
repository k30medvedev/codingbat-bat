package string1;

public class LastChars {
    public String lastChars(String a, String b) {


        if (a.length() == 0 & b.length() == 0)
            return new String("@@");

        else if (a.length() > 0 & b.length() > 0) {
            String suba = a.substring(0, 1);
            String subb = b.substring(b.length() - 1);
            return new String(suba + subb);

        } else if (a.length() == 0)
            return new String("@" + b.substring(b.length() - 1));

        else if (b.length() == 0)
            return new String(a.substring(0, 1) + "@");


        else return new String("@@");

    }

}
