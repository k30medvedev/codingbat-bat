package string1;

public class MakeTags {

    public String makeTags(String tag, String word) {

        return new String("<"+tag+">"+word+"</"+tag+">");
    }

}
