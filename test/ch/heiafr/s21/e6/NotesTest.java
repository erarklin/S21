package ch.heiafr.s21.e6;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NotesTest {
    @Test
    void avgsWithStream() {
        Notes instance = new Notes();
        Pair<Double[], Double> expectedResult = instance.avgs();
        Pair<Double[], Double> result = instance.avgsWithStream();
        assertTrue(Arrays.equals(expectedResult.getKey(), result.getKey()));
        assertEquals(expectedResult.getValue(), result.getValue());
    }

}