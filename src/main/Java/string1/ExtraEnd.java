package string1;

public class ExtraEnd {
    public String extraEnd(String str) {

        String string = "";
        String substring = str.substring(str.length()-2,str.length());

        for (int i = 0; i <3 ; i++) {
            string = string.concat(substring);
        }

           return string;
    }

}
