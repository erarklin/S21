package ch.heiafr.s21.e4;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args){
//        System.out.print(sumOfDivisors(496L));
        LongStream.range(0, 10000).map(x -> checkPerfect(x,x)).filter(x -> x != -1).forEach(System.out::println);
    }

    private static long sumOfDivisors(long l) {
        return LongStream.range(1, l-1).filter(x -> l%x == 0).sum();
    }

    private static long checkPerfect(long l, long numberToCheck){
        return (sumOfDivisors(l) == numberToCheck) ? numberToCheck : -1;
    }
}
