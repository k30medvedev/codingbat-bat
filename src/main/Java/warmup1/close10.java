package warmup1;

public class close10 {
    public static int close10(int a, int b) {
        if (a==b)
            return 0;
        else if (10-a == b-10) return 0;
        else if (10-a == 10-b) return 0;
        else if (a-10 == 10-b) return 0;
        else if (a-10 == b-10) return 0;
        else if (10-a >10-b)return a;
        else return b;
}

    public static void main(String[] args) {

        System.out.println(close10(7,13));;
    }

}
