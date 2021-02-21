package string1;

public class NonStart {
    public String nonStart(String a, String b) {

      String suba = a.substring(1,a.length());
      String subb = b.substring(1,a.length());
      return new String(suba+subb);

    }

}
