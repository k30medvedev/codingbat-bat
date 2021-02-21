package warmup2;
//Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//        stringSplosion("Code") → "CCoCodCode"
//        stringSplosion("abc") → "aababc"
//        stringSplosion("ab") → "aab"

public class StringSplosion {
    public String stringSplosion(String str) {

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            str = String.valueOf(chars[i]);

            str = str.concat(str);

        }

        return str;
    }

}
