package string1;

public class FrontAgain {
    public static boolean frontAgain(String str) {

      if (str.length()<2)
          return false;

        String sub = str.substring(0,2);
        String sub2 = str.substring(str.length()-2,str.length());
        if (sub.equals(sub2))
            return true;

        else return false;

    }

    public static void main(String[] args) {

       boolean b =  frontAgain("jjjk");
        System.out.println(b);
    }
}
