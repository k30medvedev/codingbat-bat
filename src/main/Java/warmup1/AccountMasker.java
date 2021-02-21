package warmup1;

public class AccountMasker {
    public static String maskAccaount(String accNum){
        String lead = "***************";

        return lead+accNum.substring(15,20);
    }


    public static void main(String[] args) {

        String accNum = "12345678901234566666";

        System.out.println(maskAccaount(accNum));


    }
}
