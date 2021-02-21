package warmup2;

public class StringMatch {
    public int stringMatch(String a, String b) {

        int n = Math.min(a.length(), b.length());
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if ((a.substring(0, i).equals(b.substring(0, i)))) {
                return counter = counter + 1;
            }

        }return counter;
    }

}
