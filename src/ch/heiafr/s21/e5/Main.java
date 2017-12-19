package ch.heiafr.s21.e5;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
	    Path path = FileSystems.getDefault().getPath("wordlist.txt");
        Files.lines(path)
                .filter(x -> x.length() == 11)
                .filter(x -> x.charAt(2) == 't')
                .filter(x -> x.charAt(4) == 'l')
                .filter(x -> x.chars().distinct().count() ==6)
                .forEach(System.out::println);



        Files.lines(path)
                .filter(x -> x.length() >= 4)
                .map(x -> x.toLowerCase())
                .filter(x -> x == new StringBuilder(x).reverse().toString())
                .forEach(System.out::println);

    }
}
