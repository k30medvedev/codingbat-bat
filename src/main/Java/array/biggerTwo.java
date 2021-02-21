package array;

public class biggerTwo {

    public int[] biggerTwo(int[] a, int[] b) {

        int summa=0;
        int summb=0;

        for (int i = 0; i <a.length-1 ; i++) {
            summa +=a[i];
        }
        for (int i = 0; i <b.length-1 ; i++) {
            summb +=b[i];
        }

        if (summa>summb)
            return a;

        if (summa<summb)
            return b;
        else return  new int []{1};
    }
}
