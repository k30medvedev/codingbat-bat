package warmup1;

public class StringBuilderTest {
    public static void main(String[] args) {

        String string = "Hello";
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = new StringBuilder("Hello");


        System.out.println(string.equals(stringBuilder1));

        System.out.println(stringBuilder1.equals(stringBuilder2));


        System.out.println(stringBuilder1.compareTo(stringBuilder2));




    }
}
