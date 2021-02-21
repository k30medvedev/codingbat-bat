package warmup1;

public class DeleteDel {
    public String delDel(String str) {
    if (str.contains("del") & str.indexOf("d")==1)
        return str.replace("del","");
    else return str;
    }

}
