package warmup1;

public class StringE {
    public static boolean stringE(String str) {
        int chek = 0;
        char[] result = str.toCharArray();

        for (int i=0; i < result.length; i++)
        {if (result[i] == 101)
            chek=chek+1;
        };

        if (chek>=1 & chek <=3){
            return true;
        }
        else if (chek >3 )
            return false;
        else return false;
    }

    public static void main(String[] args) {

        System.out.println(stringE("eeee"));

    }

}
