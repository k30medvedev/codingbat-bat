package warmup1;

public class Front22 {
    public String front22(String str) {
    if (str.length()>0 & str.length()<2){
    StringBuilder stringBuilder = new StringBuilder(str);
    stringBuilder.append(str.substring(0,2));
    stringBuilder.insert(0,str.substring(0,2));
    return stringBuilder.toString();
    }
    else if (str.length()==1){
        return str+str+str;
    }
    else return str;
    }

}
