package warmup1;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        String str = null;
        StringBuilder stringBuilder = new StringBuilder("12345678910");
        StringBuilder stringBuilder2 = new StringBuilder("Cat");
        System.out.println(stringBuilder.toString().equals(stringBuilder2.toString()));
        System.out.println(str);
        System.out.println(stringBuilder.capacity());

        StringBuilder stringBuilder3 = new StringBuilder();
        Object object = null;
        stringBuilder.append(object);

        System.out.println("gello" + 1);

        "a".replace("a","b");
        "a".replace('a','b');
        "a".replace('a','b');



        stringBuilder.replace(0,1,"5 ");
        stringBuilder.replace(0,1, "5");


        String str1 = "";
        System.out.println("Я тут:" + str1);
        //stringBuilder3.append(str1 + "World" + 5 + "Cat");
        stringBuilder3.append(1).append("Cat").append("    ");
        System.out.println(stringBuilder3.toString());


        String a = "B";
        a = a.concat("U");
        String b = "L";
        a = a.concat(b);
        a.replace('U','A');
        System.out.println(a);


        String test = "12456";
        System.out.println(test.length());
        System.out.println(test.charAt(4));

        char c = 6;
//        System.out.println("Hello".charAt(c));  SIOOBE

    }
}
