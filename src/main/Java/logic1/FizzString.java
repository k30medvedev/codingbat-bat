package logic1;

public class FizzString {
    public String fizzString(String str) {

        if (str.startsWith("f") && str.endsWith("b"))
            return "FizzBuzz";
        if (str.startsWith("f"))
            return "Fizz";
        if (str.endsWith("b"))
            return "Buzz";
        else return str;
    }
}
