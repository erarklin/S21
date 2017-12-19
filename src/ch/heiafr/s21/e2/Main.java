package ch.heiafr.s21.e2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] macAddress = new int[]{78, 26, 253, 6, 240, 13};
        Stream.concat(Arrays.stream(macAddress).
                        limit(macAddress.length - 1).
                        mapToObj((x) -> String.format("%02X:", x)),
                Stream.of(macAddress[macAddress.length - 1]).
                        map(x -> String.format("%02X", x))).
                forEach(System.out::print);
    }

}
