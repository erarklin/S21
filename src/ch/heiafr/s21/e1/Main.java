package ch.heiafr.s21.e1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] exponents = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(exponents).map(x -> (int)Math.pow(2,x)).forEach(System.out::println);
    }
}
