package string1;

public class TheEnd {
    public String theEnd(String str, boolean front) {

        if (front)
        {return new String(str.substring(0,1));
        }
         else {
             return new String(str.substring(str.length()-1,str.length()));
        }
    }

}
