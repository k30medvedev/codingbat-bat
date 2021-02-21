package string1;

public class HasBad {
    public boolean hasBad(String str) {

        return str.startsWith("bad", 0) | str.startsWith("bad", 1);
    }

}
