package warmup1;

public class StringTest {
    static String giveMeString(){
        return " world";
    }
    public static void main(String[] args) {

       

        String s1 = "Hello world";
        String s2 = "Hello" + " world";
        String s3 = "Hello";
        String s4 = " world";
        String s41 = s3+s4;
        String s5 = giveMeString();
        System.out.println(s1==s2);
        System.out.println(s1==s41);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1==s3+s4);
        System.out.println(s1==s3+giveMeString());



    }
}
