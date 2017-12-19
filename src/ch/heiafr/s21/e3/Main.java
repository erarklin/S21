package ch.heiafr.s21.e3;

import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        System.out.print(Arrays.toString(divisors(496L)));
    }

    private static long[] divisors(long l) {
        return LongStream.range(1,l-1).filter(x -> l%x == 0).toArray();
    }
}
