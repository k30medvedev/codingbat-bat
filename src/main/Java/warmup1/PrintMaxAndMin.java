package warmup1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintMaxAndMin {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        System.out.println("Вводи числа: ");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        if (!input.equals("null")) {

            list.add(input);
            List<Integer> intList = list.stream()
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());

        }


    }

}
