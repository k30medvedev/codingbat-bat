package warmup1;

public class Reverse {


    public static String frontBack(String str) {
   if (str.length()>0){
    char[] chars = str.toCharArray();
    char helper;
    helper = chars[chars.length-1];
    chars[chars.length-1]=chars[0];
    chars[0] = helper;
    String string = new String(chars);
    return string;
    }
   else return "";
    }

}
