package string1;

public class NTwice {

    public String nTwice(String str, int n) {


        String string = str.substring(0,n);
        String string2 = str.substring(str.length()-n,str.length());
        return new String(string+string2);

    }

}
