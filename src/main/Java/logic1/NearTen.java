package logic1;

public class NearTen {
    public boolean nearTen(int num) {

        if ((num+1)%10==0|(num+2)%10==0|num %10==0)
            return true;
        if ((num-1)%10==0|(num-2)%10==0)
            return true;
        else return false;

    }

}
