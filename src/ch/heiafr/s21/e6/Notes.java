package ch.heiafr.s21.e6;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Notes {
    double results[][] = {
            {9, 10, 8, 5, 9},
            {5, 9, 9, 8, 8},
            {4, 8, 10, 9, 5},
            {8, 10, 8, 10, 7},
            {8, 9, 7, 10, 6},
    };

    public Pair<Double[], Double> avgs(){
        Double[] notes = new Double[results.length];
        for(int i = 0; i < results.length; i++){
            double sum = 0;
            for(int j = 0; j < results[i].length; j++)
                sum += results[i][j];
            notes[i] = 1.0 + sum / 10.0;
        }
        double sum = 0;
        for(int i = 0; i < notes.length; i++)
            sum += notes[i];
        double avg = sum/notes.length;

        return new Pair<>(notes, avg);
    }

    public Pair<Double[], Double> avgsWithStream(){
        Double[] notes = Arrays.stream(results).map(result -> Arrays.stream(result).sum()).map(x -> 1.0+ x /10.0).toArray(Double[]::new);
        Double avg = Arrays.stream(notes).mapToDouble(x -> x.doubleValue()).average().getAsDouble();

        return new Pair<>(notes, avg);
    }
}
