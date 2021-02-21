package warmup1;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        if (str.length()>3){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            stringBuilder.append(str.substring(0,3));
        }
        return stringBuilder.toString();}


        if (str.length()==1){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <n ; i++) {
                stringBuilder.append(str.substring(0,1));
            }
            return stringBuilder.toString();

        }
        if (str.length()==2){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <n ; i++) {
                stringBuilder.append(str.substring(0,2));
            }
            return stringBuilder.toString();

        }else return "";
}
}
