package logic1;

public class In1To10 {
    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode){
            if ((n >= 1) & (n >=10))
                return true;
            else return false;
        }

        if (n >= 1 & n <= 10)
            return true;

        else return false;

    }

    public static void main(String[] args) {
        System.out.println(in1To10(-1,true));
    }

}
