package string1;

public class ComboString {
    public String comboString(String a, String b) {
     if (a.length()>b.length())
         return new String(b+a+b);
     else return new String(a+b+a);
    }

}
