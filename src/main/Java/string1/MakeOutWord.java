package string1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {

        return new String(   out.substring(0,out.length()/2) + word+out.substring((out.length()/2),out.length()));
    }

}
