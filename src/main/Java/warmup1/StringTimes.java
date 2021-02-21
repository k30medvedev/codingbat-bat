package warmup1;

public class StringTimes {
    public String stringTimes(String str, int n) {
    StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            stringBuilder.append(str);
        }
    return stringBuilder.toString();
    }
}
