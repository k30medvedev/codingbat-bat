package string1;

public class Without2 {
    public String without2(String str) {
        if (str.length()==1)
            return str;


        if (str.length()==0)
           return "";

        if (str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
        {
            return str.substring(2,str.length());
        }

        if (str.startsWith("Hi"))
            return "";



        return str;
    }

    public static void main(String[] args) {
        String string = "HelloHe";

        System.out.println(string.substring(0,2));
        System.out.println(string.substring(string.length()-2,string.length()));
    }
}
