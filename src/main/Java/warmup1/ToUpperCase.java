package warmup1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) throws IOException {

        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        str = br.readLine();



        System.out.println("Uppercase conversion:");
        System.out.println(str.toUpperCase());
    }
}
