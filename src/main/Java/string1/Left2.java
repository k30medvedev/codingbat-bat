package string1;

public class Left2 {
    public String left2(String str) {

      if (str.length()>2)
      {
          String sub = str.substring(0,str.length()-2);
          String sub2 = str.substring(str.length()-2,str.length());
          return new String(sub2+sub);

      }
        else return str;
    }
}
